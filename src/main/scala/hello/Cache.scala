package hello

object user_cache {
   val map_ = scala.collection.mutable.Map[String, User]()
   def GetUser(name : String) : User = {
     return map_.getOrElse(name, new User(""));
   }
   def SetUser(name : String, user: User) = {
     Print();
     map_(name) = user;
   }
   def Print() = {
     println("printing map");
     for ((key, value) <- map_) println (key + "-->" + value);
   } 
}
