package example.components.table.base

import emotion.styled.styled
import example.theme.Theme
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.tr
import tanstack.table.core.Row
import web.cssom.Border
import web.cssom.Cursor
import web.cssom.LineStyle.Companion.solid
import web.cssom.px

internal external interface TableRowProps : PropsWithValue<Row<*>>

internal val TableRow: FC<TableRowProps> = FC { props ->
    val row = props.value

    Container {
        for (cell in row.getVisibleCells()) {
            TableCell {
                key = cell.id
                value = cell
            }
        }
    }
}

private val Container = tr.styled {
    fontSize = 16.px
    cursor = Cursor.pointer
    borderBottom = Border(1.px, solid, Theme.Stroke.LightGray)

    hover {
        backgroundColor = Theme.Background.Gray
    }
}
