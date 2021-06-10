package subtask1

import java.time.DateTimeException
import java.time.LocalDate


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var str: String
        try {
        val Date: LocalDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            str = "$day ${getMonth(Date)}, ${getDayOfWeek(Date)}"
        }
        catch (e: DateTimeException)
        {
             str = "Такого дня не существует"
        }
        return str
        throw NotImplementedError("Not implemented")
    }

     fun getDayOfWeek(date: LocalDate): String
    {
        when(date.dayOfWeek.toString()) {
        "MONDAY" -> return "понедельник"
        "TUESDAY" -> return "вторник"
        "WEDNESDAY" -> return "среда"
        "THURSDAY" -> return "четверг"
        "FRIDAY" -> return "пятница"
        "SATURDAY" -> return "суббота"
        "SUNDAY" -> return "воскресенье"
        else -> return ""
      }
    }

    fun getMonth(date: LocalDate): String
    {
        when(date.month.toString()) {
            "JANUARY" -> return "января"
            "FEBRUARY" -> return "февраля"
            "MARCH" -> return "марта"
            "APRIL" -> return "апреля"
            "MAY" -> return "мая"
            "JUNE" -> return "июня"
            "JULY" -> return "июля"
            "AUGUST" -> return "августа"
            "SEPTEMBER" -> return "сентября"
            "OCTOBER" -> return "октября"
            "NOVEMBER" -> return "ноября"
            "DECEMBER" -> return "декабря"
            else -> return ""
        }
    }

}
