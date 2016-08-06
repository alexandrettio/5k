case class Tag(name: String) { }
case class Task(id: Integer, description: String, completed: Boolean, dueDate: Double, tags: List[Tag]) {
  def addTag(name: String) = this.copy(tags = Tag(name) :: tags)
}
