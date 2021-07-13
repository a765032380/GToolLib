package pub.gll.gtoollib.ext

import android.view.View

/**
 * ================================================================
 * 创建时间：2021/7/13
 * 创建人：gll_android
 * 邮件：gll_android@163.com
 * 文件描述：
 * ================================================================
 */

/*** 可见性相关 ****/
fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

val View.isGone: Boolean
    get() {
        return visibility == View.GONE
    }

val View.isVisible: Boolean
    get() {
        return visibility == View.VISIBLE
    }

val View.isInvisible: Boolean
    get() {
        return visibility == View.INVISIBLE
    }
