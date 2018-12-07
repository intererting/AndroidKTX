package com.lxj.androidktxdemo.fragment

import com.lxj.androidktx.core.add
import com.lxj.androidktx.core.replace
import com.lxj.androidktxdemo.R

/**
 * Description:
 * Create by dance, at 2018/12/5
 */
class FragmentExtPage: BaseFragment(){
    override fun getLayoutId() = R.layout.fragment_fragment_ext

    override fun initView() {
        replace(R.id.frame1, TempFragment(), arrayOf(
                TempFragment.Key1 to "我是第一个Fragment",
                TempFragment.Key2 to "床前明月光"
        ))

        replace(R.id.frame2, TempFragment(), arrayOf(
                TempFragment.Key1 to "我是第二个Fragment",
                TempFragment.Key2 to "疑是地上霜"
        ))


    }
}