package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.flexOrder() {
    div("grid-container") {
        attrs.id = "grid-flex-order"
        div {
            row {
                attrs { type = "flex" }
                col {
                    attrs {
                        span = 6
                        order = 4
                    }
                    +"1 col-order-4"
                }
                col {
                    attrs {
                        span = 6
                        order = 3
                    }
                    +"2 col-order-3"
                }
                col {
                    attrs {
                        span = 6
                        order = 2
                    }
                    +"3 col-order-2"
                }
                col {
                    attrs {
                        span = 6
                        order = 1
                    }
                    +"4 col-order-1"
                }
            }
        }
    }
}
