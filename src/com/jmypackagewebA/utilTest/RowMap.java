package com.jmypackagewebA.utilTest;

import com.jmypackagewebA.pojo.User;

import java.sql.ResultSet;

public interface RowMap<T> {
    public T rowMapping(ResultSet rs);
}
