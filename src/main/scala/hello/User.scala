package hello

class User(val in_name: String) {
  var name : String = in_name
  override def toString(): String = "name :" + name;
};

