package com.baidu.disconf2.web.store.form;

import com.baidu.dsp.common.form.RequestFormBase;

/**
 * 
 * @author liaoqiqi
 * @version 2014-1-24
 */
public class ConfForm extends RequestFormBase {

    /**
     * 
     */
    private static final long serialVersionUID = 4556205917730218419L;

    private String app;

    private String maintype;

    private String env;

    private String key;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getMaintype() {
        return maintype;
    }

    public void setMaintype(String maintype) {
        this.maintype = maintype;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}