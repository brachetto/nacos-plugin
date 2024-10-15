package com.alibaba.nacos.plugin.datasource.enums.oracle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author brachetto
 * @description TODO
 * @createTime 2024-10-15 16:02
 * @updateTime
 */
public enum TrustedOracleFunctionEnum {

    NOW("SYSDATE", "SYSTIMESTAMP");

    private static final Map<String, TrustedOracleFunctionEnum> LOOKUP_MAP = new HashMap<>();

    static {
        for (TrustedOracleFunctionEnum entry : TrustedOracleFunctionEnum.values()) {
            LOOKUP_MAP.put(entry.functionName, entry);
        }
    }

    private final String functionName;

    private final String function;

    TrustedOracleFunctionEnum(String functionName, String function) {
        this.functionName = functionName;
        this.function = function;
    }

    /**
     * Get the function name.
     *
     * @param functionName function name
     * @return function
     */
    public static String getFunctionByName(String functionName) {
        TrustedOracleFunctionEnum entry = LOOKUP_MAP.get(functionName);
        if (entry != null) {
            return entry.function;
        }
        throw new IllegalArgumentException(String.format("Invalid function name: %s", functionName));
    }
}
