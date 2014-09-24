package hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@RestController
class HelloWorldController () {
  @RequestMapping(value=Array("/user"), method=Array(RequestMethod.GET))
  def GetUser() : User = {
    user_cache.SetUser("bob", new User("bob"));
    return user_cache.GetUser("bob");
  }
}
