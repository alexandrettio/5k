import org.scalatest._

class TaskTagsSpec extends FeatureSpec with GivenWhenThen {
//  info("As user")
//  info("I want to mark my tasks with tags")
//  info("So I can group it by activity type")

  info("Как пользователь")
  info("Я хочу отмечать мои задачи тегами")
  info("Чтобы можно было сгруппировать задачи по типам действия")

  feature("Работа с тегами") {
    scenario("Получить список задач по тегу") {
      val tagName = "позвонить"

      Given("задача без тегов")
      val task = new Task(1, "some desc", false, 0, List[Tag]())
      When("добавляем задаче тег 'позвонить'")
      val taskWithTag = task.addTag(tagName)
      Then("задача есть в списке задач по тегу 'позвонить'")
      assert(taskWithTag.tags.contains(Tag(tagName)))
    }
  }

}
