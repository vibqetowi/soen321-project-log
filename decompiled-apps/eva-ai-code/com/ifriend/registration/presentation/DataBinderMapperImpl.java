package com.ifriend.registration.presentation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.registration.presentation.databinding.FragmentEmailRegistrationBindingImpl;
import com.ifriend.registration.presentation.databinding.FragmentRegistrationVideoBackgroundBindingImpl;
import com.ifriend.registration.presentation.databinding.FragmentResetPasswordBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_FRAGMENTEMAILREGISTRATION = 1;
    private static final int LAYOUT_FRAGMENTREGISTRATIONVIDEOBACKGROUND = 2;
    private static final int LAYOUT_FRAGMENTRESETPASSWORD = 3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.fragment_email_registration, 1);
        sparseIntArray.put(R.layout.fragment_registration_video_background, 2);
        sparseIntArray.put(R.layout.fragment_reset_password, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i2 == 1) {
                    if ("layout/fragment_email_registration_0".equals(tag)) {
                        return new FragmentEmailRegistrationBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_email_registration is invalid. Received: " + tag);
                } else if (i2 == 2) {
                    if ("layout/fragment_registration_video_background_0".equals(tag)) {
                        return new FragmentRegistrationVideoBackgroundBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_registration_video_background is invalid. Received: " + tag);
                } else if (i2 != 3) {
                    return null;
                } else {
                    if ("layout/fragment_reset_password_0".equals(tag)) {
                        return new FragmentResetPasswordBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_reset_password is invalid. Received: " + tag);
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
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
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.analytics.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.api.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.domain.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.new_chat.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.core.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.data.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.icon_switcher.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.infrastructure.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.popup.api.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.registration.domain.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.ui.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes6.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes6.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(3);
            sKeys = hashMap;
            hashMap.put("layout/fragment_email_registration_0", Integer.valueOf(R.layout.fragment_email_registration));
            hashMap.put("layout/fragment_registration_video_background_0", Integer.valueOf(R.layout.fragment_registration_video_background));
            hashMap.put("layout/fragment_reset_password_0", Integer.valueOf(R.layout.fragment_reset_password));
        }
    }
}
