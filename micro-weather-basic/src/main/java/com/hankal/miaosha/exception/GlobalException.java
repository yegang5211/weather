package com.hankal.miaosha.exception;

import com.hankal.miaosha.result.CodeMsg;

/**
 * Created by yegang5211 on 2018/2/11.
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg codeMsg;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.codeMsg = cm;
    }

    public CodeMsg getCm() {
        return codeMsg;
    }

}
