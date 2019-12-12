package com.poseidon.framework.sql.pte.generate;

import com.poseidon.framework.exception.PteGrammarException;
import com.poseidon.framework.tools.PteString;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * [@NotNull] 对应的处理器
 * Create by 2BKeyboard on 2019/12/12 14:50
 */
public class PteNotNullProcess implements PteNotNullProcessor{

    List<String> properties=new ArrayList<>();
    {
        properties.add("line");
        properties.add("process");
    }

    /**
     * 需要处理的字符串
     */
    @Setter
    @Getter
    private PteString value;

    @Override
    public void _line() {

    }

    @Override
    public void _process() {

    }


    public void process(PteString value,String property){
        errorCheck(value, property);
    }

    /**
     * 错误检测
     *
     * 假设当前NotNull语法中可以包含以下属性：
     *      1. line
     *      2. process
     *
     * 如果两者都不具备则抛出{@link com.poseidon.framework.exception.PteGrammarException}
     *
     * @param       value         需要处理的字符串
     * @param       property      属性名
     */
    private void errorCheck(PteString value,String property) {
        if(value == null)
            throw new NullPointerException("value is null");
        if(!properties.contains(property))
            throw new PteGrammarException("NotNull grammar error not \""+property+"\" property");
    }
}