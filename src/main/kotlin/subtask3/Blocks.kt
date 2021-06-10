package subtask3

import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB)
        {
            Int::class -> return blockA.filterIsInstance<Int>().sum()
            String::class -> return blockA.filterIsInstance<String>().joinToString("")
            LocalDate::class -> return DateTimeFormatter.ofPattern("dd.MM.yyyy").format(blockA.filterIsInstance<LocalDate>().max())
        }
        throw NotImplementedError("Not implemented")
    }
}
