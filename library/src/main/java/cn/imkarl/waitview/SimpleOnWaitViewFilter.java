package cn.imkarl.waitview;

import android.view.View;
import android.view.ViewGroup;

/**
 * WaitView过滤器
 * @version imkarl 2017-05
 */
public class SimpleOnWaitViewFilter implements OnWaitViewFilter {
    public FilterType onFilter(View view) {
        if (view == null) {
            return FilterType.Ignored;
        }
        // 过滤不可见的
        if (view.getVisibility() != View.VISIBLE) {
            return FilterType.Ignored;
        }
        // 过滤android.view.View
        if (View.class.equals(view.getClass())) {
            return FilterType.Ignored;
        }

        if (view instanceof ViewGroup) {
            return FilterType.Childs;
        } else {
            return FilterType.WaitView;
        }
    }
}
