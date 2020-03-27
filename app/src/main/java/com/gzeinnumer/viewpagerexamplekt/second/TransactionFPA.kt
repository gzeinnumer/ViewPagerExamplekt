package com.gzeinnumer.viewpagerexamplekt.second

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TransactionFPA(
    fragmentManager: FragmentManager?,
    count: Int
) :
    FragmentPagerAdapter(fragmentManager!!, count) {

    private var count = 0
    private val firstViewpagerFragment: FirstViewpagerFragment
    private val secondViewpagerFragment: SecondViewpagerFragment

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            firstViewpagerFragment
        } else if (position == 1) {
            secondViewpagerFragment
        } else {
            firstViewpagerFragment
        }
    }

    override fun getCount(): Int {
        return count
    }

    init {
        this.count = count
        firstViewpagerFragment = FirstViewpagerFragment.newInstance()
        secondViewpagerFragment = SecondViewpagerFragment.newInstance()
    }
}
