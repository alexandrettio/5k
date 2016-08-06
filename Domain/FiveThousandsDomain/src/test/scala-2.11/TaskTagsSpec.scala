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
      Given("задача без тегов")
      When("добавляем задаче тег 'позвонить'")
      Then("задача есть в списке задач по тегу 'позвонить'")
    }
  }

}
