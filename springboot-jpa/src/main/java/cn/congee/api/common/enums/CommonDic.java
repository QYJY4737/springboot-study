package cn.congee.api.common.enums;

/**
 * 字典定义统一规则：
 * 1）字典名，按照类命名规则
 * 2）字典值，统一按照大写，多个单词用下划线隔开
 *
 * @Date: 2021/1/7
 * @Time: 16:16
 * @author: wgb
 **/
public final class CommonDic {

    /**
     * 是否认证
     *
     */
    public enum AuthStateDic implements BaseDic {
        /**
         * 认证状态
         */
        NOT_AUTH("1", "未认证"),
        AUTHING("2", "认证中"),
        AUTH_SUCCESS("3", "已认证"),
        AUTH_FAIL("4", "认证失败");

        AuthStateDic(String code, String name) {
            this.code = code;
            this.name = name;
        }

        private String code;
        private String name;

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public String getName() {
            return name;
        }

        static public String getDicCode() {
            return "air_auth_state";
        }

        public String getDicName() {
            return "认证状态";
        }

        public static String getNameByCode(String code) {
            for (AuthStateDic type : values()) {
                if (type.getCode().equals(code)) {
                    return type.getName();
                }
            }
            return null;
        }
    }

}
