package cn.imkarl.waitview;

import android.view.View;

/**
 * WaitView过滤器
 * @version imkarl 2017-05
 */
public interface OnWaitViewFilter {
    FilterType onFilter(View view);
}
