package com.xq.myasdependency.viewutil;

import android.animation.TypeEvaluator;

/**
 * description : 角度计算器
 */
public class AngleEvaluator implements TypeEvaluator {

    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        float start = (float) startValue;
        float end = (float) endValue;
        return start + fraction * (end - start);
    }

}