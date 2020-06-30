package groovy


import org.jiakesimk.minipika.components.annotation.SQL
import org.jiakesimk.minipika.components.mql.MqlBuilder
import org.jiakesimk.minipika.framework.asm.ASMUtils
import org.junit.Test

import java.lang.reflect.Method

class MqlMapper {

  @SQL("""
    select * from minipika_user where 1=1
    #if INE(user.name) && user.name != null
      and username = #{user.name}
    #end
    and wdnmd = #{wdnmd}
  """)
  def findUser(User user, String wdnmd) {}

  @SQL("""
    insert into user (username) values (#{user.name})
  """)
  def addUser(User user) {}

  @SQL("""
    #foreach user : users
      insert into user (username) values (#{user.name})
    #end
  """)
  def addBatch(List<User> users){}

  @Test
  void test() {
    User user = new User()
    user.name = "123"
    MqlBuilder m = new MqlBuilder(MqlMapper.class)
    println m.invoke("findUser", user, "XXX")
    println m.invoke("addUser", user)
    List<User> users = [new User("name1"), new User("name2")]
    println m.invoke("addBatch", users)
  }

  @Test
  void getParameterNamesTest() {
    Method method = MqlMapper.class.getDeclaredMethod("findUser", User.class, String.class)
    println ASMUtils.getParameters(method)

  }

}