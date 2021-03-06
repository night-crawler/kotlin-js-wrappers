@file:JsModule("antd/lib/layout")

package antd.layout

import antd.HTMLAttributes
import org.w3c.dom.HTMLDivElement
import react.*

@JsName("default")
external object LayoutComponent : Component<LayoutProps, RState> {
    val Header: HeaderComponent
    val Footer: FooterComponent
    val Content: ContentComponent
    val Sider: SiderComponent

    override fun render(): ReactElement?
}

external interface LayoutProps : HTMLAttributes<HTMLDivElement>, RProps {
    var prefixCls: String?
    var hasSider: Boolean?
}

external interface LayoutContextProps {
    var siderHook: LayoutSiderHook
}

external interface LayoutSiderHook {
    var addSider: (id: String) -> Unit
    var removeSider: (id: String) -> Unit
}
