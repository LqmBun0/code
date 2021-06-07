package com.ss.task.mobile;

import com.ss.task.model.TaskEntity;
import com.ss.task.model.TaskUserEntity;
import com.ss.task.model.UserEntity;
// com.ss.task.phoneResult.LoginResult;
//import com.ss.task.phoneResult.PubResult;
import com.ss.task.service.TaskService;
import com.ss.task.util.BaseController;
import com.ss.webutil.struct.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;
/**
 * Created by Steven Tang on 2015/10/7.
 */
@RestController
@RequestMapping("mobile/task/list/")
public class MobileController extends BaseController{
    @Autowired
    TaskService taskService;

}
