package com.ifriend.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(18);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.analytics.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.animatedBackground.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.api.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.new_chat.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.presentation.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.core.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.data.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.icon_switcher.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.infrastructure.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.keychain.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.long_term_notifications.impl.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.popup.api.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.popup.impl.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.push_notification.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.registration.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.registration.presentation.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.ui.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes6.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "vm");
        }
    }

    /* loaded from: classes6.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(0);

        private InnerLayoutIdLookup() {
        }
    }
}
