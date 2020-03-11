import slick.jdbc.MySQLProfile.api._
class People(tag: Tag) extends Table[(Int,String,String,Int)](tag, "PEOPLE"){
  def id = column[Int]("PER_ID", O.PrimaryKey, O.AutoInc)
  def fName = column[String]("PER FNAME")
  def lName = column[String]("PER LNAME")
  def age = column[Int]("PER AGE")
  def * = (id, fName, lName, age)
}


