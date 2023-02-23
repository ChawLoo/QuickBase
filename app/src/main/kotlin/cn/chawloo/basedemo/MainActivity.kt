package cn.chawloo.basedemo

import cn.chawloo.base.base.BaseActivity
import cn.chawloo.base.ext.doClick
import cn.chawloo.base.ext.longToast
import cn.chawloo.base.ext.toast
import cn.chawloo.basedemo.databinding.ActivityMainBinding
import com.dylanc.viewbinding.binding
import com.safframework.log.L

class MainActivity : BaseActivity() {
    private val vb by binding<ActivityMainBinding>()

    override fun initialize() {
        vb.btnShowToast.doClick {
            toast("测试气泡消息")
        }
        vb.btnShowLongToast.doClick {
            longToast("测试长气泡消息")
        }
    }
}