package samples.layout

import antd.icon.icon
import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.footer
import antd.layout.sider
import antd.menu.*
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.fixedSider() {
    div("layout-container") {
        attrs.id = "layout-fixed-sider"
        layout {
            sider {
                attrs {
                    style = js {
                        overflow = "auto"
                        height = "100vh"
                        position = "fixed"
                        left = 0
                    }
                }
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        mode = "inline"
                        defaultSelectedKeys = arrayOf("4")
                    }
                    menuItem {
                        attrs.key = "1"
                        icon {
                            attrs.type = "user"
                        }
                        span("nav-text") { +"mav 1" }
                    }
                    menuItem {
                        attrs.key = "2"
                        icon {
                            attrs.type = "video-camera"
                        }
                        span("nav-text") { +"nav 2" }
                    }
                    menuItem {
                        attrs.key = "3"
                        icon {
                            attrs.type = "upload"
                        }
                        span("nav-text") { +"nav 3" }
                    }
                    menuItem {
                        attrs.key = "4"
                        icon {
                            attrs.type = "bar-chart"
                        }
                        span("nav-text") { +"nav 4" }
                    }
                    menuItem {
                        attrs.key = "5"
                        icon {
                            attrs.type = "cloud-o"
                        }
                        span("nav-text") { +"nav 5" }
                    }
                    menuItem {
                        attrs.key = "6"
                        icon {
                            attrs.type = "appstore-o"
                        }
                        span("nav-text") { +"nav 6" }
                    }
                    menuItem {
                        attrs.key = "7"
                        icon {
                            attrs.type = "team"
                        }
                        span("nav-text") { +"nav 7" }
                    }
                    menuItem {
                        attrs.key = "8"
                        icon {
                            attrs.type = "shop"
                        }
                        span("nav-text") { +"nav 8" }
                    }
                }
            }
            layout {
                attrs.style = js { marginLeft = 200 }
                header {
                    attrs {
                        style = js {
                            background = "#fff"
                            padding = 0
                        }
                    }
                }
                content {
                    attrs {
                        style = js {
                            margin = "24px 16px 0"
                            overflow = "initial"
                        }
                    }
                    div {
                        attrs {
                            jsStyle = js {
                                padding = 24
                                background = "#fff"
                                textAlign = "center"
                            }
                        }
                        +"..."
                        br {}
                        +"Really"
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"long"
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        + "content"
                    }
                }
                footer {
                    attrs.style = js { textAlign = "center" }
                    +"Ant Design ©2016 Created by Ant UED"
                }
            }
        }
    }
}
