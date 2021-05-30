package cn.yzccz.springbootsimple.service;

import cn.yzccz.springbootsimple.entity.User;
import cn.yzccz.springbootsimple.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
//    @Autowired
//    IService<User> userIService;
//
//    public List<User> getAllUser() {
//        return userIService.list();
//    }

}
