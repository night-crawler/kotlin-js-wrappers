package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: String, option: Any) {
    console.log("selected $value")
}

fun RBuilder.basic() {
    div("select-container") {
        attrs.id = "select-basic"
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    onChange = ::handleChange
                    style = js { width = 120 }
                }
                option {
                    attrs.value = "jack"
                    +"Jack"
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
                option {
                    attrs {
                        value = "disabled"
                        disabled = true
                    }
                    +"Disabled"
                }
                option {
                    attrs.value = "yiminghe"
                    +"Yiminghe"
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    disabled = true
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    loading = true
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
        }
    }
}
