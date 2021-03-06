package antd.tabs

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TabPaneComponent : Component<TabPaneProps, RState> {
    override fun render(): ReactElement?
}

external interface TabPaneProps : RProps {
    var tab: Any? /* String | ReactElement */
    var style: dynamic
    var closable: Boolean?
    var className: String?
    var disabled: Boolean?
    var forceRender: Boolean?
    var key: String?
}
