package com.kk.eureka.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient("eureka-user")
public interface UserClient {
  /**
   * <pre>
   * 新增
   *     param:
   *        id: [必填] ID
   *        userNo: [必填] 用户ID
   *        userName: [必填] 用户名
   *        shortName: [必填] 账号名
   *        password: [必填] 账号密码
   *        telephone: 手机号
   *        qqCode: QQ号
   *        gender: 性别1-男0-女
   *        createTime: [必填] 创建时间
   *     return: 无
   * </pre>
   */
  @PostMapping("/user/addUser")
  Object addUser(@RequestBody Object user);

  /**
   * 通过id获取
   *
   * param id id
   */
  @GetMapping("/user/getUserById")
  Object getUserById(@RequestParam("id") String id);

  /**
   * <pre>
   * 根据id删除
   * </pre>
   */
  @PostMapping("/user/delUserByIds")
  Object delUserByIds(@RequestBody List<String> ids);

  /**
   * <pre>
   * 更新
   *     param:
   *        id: [必填] ID
   *        userNo: [必填] 用户ID
   *        userName: [必填] 用户名
   *        shortName: [必填] 账号名
   *        password: [必填] 账号密码
   *        telephone: 手机号
   *        qqCode: QQ号
   *        gender: 性别1-男0-女
   *        createTime: [必填] 创建时间
   *     return: 无
   * </pre>
   */
  @PostMapping("/user/updateUser")
  Object updateUser(@RequestBody Object user);

}
