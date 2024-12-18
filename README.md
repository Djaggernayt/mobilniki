TestUI
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activity: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun useAppContext() {
        onView(withId(R.id.button)).perform(click())
        //onView(withId(R.id.imagedice)).check(matches(withId(R.drawable.ic_launcher_background)))
        onView(withId(R.id.textView)).check(matches(withText("2")))
    }


}
