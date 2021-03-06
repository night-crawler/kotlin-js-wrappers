package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import react.dom.p

fun RBuilder.borderLess() {
    div("card-container") {
        attrs.id = "card-border-less"
        div {
            attrs.jsStyle = js {
                background = "#ECECEC"
                padding = "30px"
            }
            card {
                attrs {
                    title = "Card tittle"
                    bordered = false
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
        }
    }
}
