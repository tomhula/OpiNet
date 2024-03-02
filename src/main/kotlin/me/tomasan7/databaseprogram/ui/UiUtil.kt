package me.tomasan7.databaseprogram.ui

import androidx.compose.runtime.Composable
import com.alexfacciorusso.previewer.Previewer
import com.alexfacciorusso.previewer.PreviewerScope
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toJavaLocalDate
import me.tomasan7.databaseprogram.ui.theme.AppTheme
import java.time.format.DateTimeFormatter

fun LocalDate.format(formatter: DateTimeFormatter): String
{
    return this.toJavaLocalDate().format(formatter)
}

@Composable
fun AppThemePreviewer(content: PreviewerScope.() -> Unit) {
    Previewer(wrapperBlock = { wrappedContent ->
        AppTheme(useDarkTheme = previewTheme.isDark) {
            wrappedContent()
        }
    }, content = content)
}