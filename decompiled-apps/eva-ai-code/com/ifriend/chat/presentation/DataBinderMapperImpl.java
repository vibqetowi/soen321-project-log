package com.ifriend.chat.presentation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.databinding.FragmentBotAgeBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentBotEthnicityBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentBotGenderBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentBotNameBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentBotPersonalityBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentBotVoiceBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentChangeAppIconBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentChangeEmailBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentChatBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentDarkDiaryBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentGenerateBotAvatarBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentGenerateBotAvatarErrorBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentGeneratingBotAvatarPlaceholderBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentLightDiaryBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentPreviewSendImageBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentResetBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentSelectGeneratedAvatarBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentUserAgeBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentUserGenderBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentUserNameBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentUserProfileBindingImpl;
import com.ifriend.chat.presentation.databinding.FragmentUserProfileDeleteBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_FRAGMENTBOTAGE = 1;
    private static final int LAYOUT_FRAGMENTBOTETHNICITY = 2;
    private static final int LAYOUT_FRAGMENTBOTGENDER = 3;
    private static final int LAYOUT_FRAGMENTBOTNAME = 4;
    private static final int LAYOUT_FRAGMENTBOTPERSONALITY = 5;
    private static final int LAYOUT_FRAGMENTBOTVOICE = 6;
    private static final int LAYOUT_FRAGMENTCHANGEAPPICON = 7;
    private static final int LAYOUT_FRAGMENTCHANGEEMAIL = 8;
    private static final int LAYOUT_FRAGMENTCHAT = 9;
    private static final int LAYOUT_FRAGMENTDARKDIARY = 10;
    private static final int LAYOUT_FRAGMENTGENERATEBOTAVATAR = 11;
    private static final int LAYOUT_FRAGMENTGENERATEBOTAVATARERROR = 12;
    private static final int LAYOUT_FRAGMENTGENERATINGBOTAVATARPLACEHOLDER = 13;
    private static final int LAYOUT_FRAGMENTLIGHTDIARY = 14;
    private static final int LAYOUT_FRAGMENTPREVIEWSENDIMAGE = 15;
    private static final int LAYOUT_FRAGMENTRESET = 16;
    private static final int LAYOUT_FRAGMENTSELECTGENERATEDAVATAR = 17;
    private static final int LAYOUT_FRAGMENTUSERAGE = 18;
    private static final int LAYOUT_FRAGMENTUSERGENDER = 19;
    private static final int LAYOUT_FRAGMENTUSERNAME = 20;
    private static final int LAYOUT_FRAGMENTUSERPROFILE = 21;
    private static final int LAYOUT_FRAGMENTUSERPROFILEDELETE = 22;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.fragment_bot_age, 1);
        sparseIntArray.put(R.layout.fragment_bot_ethnicity, 2);
        sparseIntArray.put(R.layout.fragment_bot_gender, 3);
        sparseIntArray.put(R.layout.fragment_bot_name, 4);
        sparseIntArray.put(R.layout.fragment_bot_personality, 5);
        sparseIntArray.put(R.layout.fragment_bot_voice, 6);
        sparseIntArray.put(R.layout.fragment_change_app_icon, 7);
        sparseIntArray.put(R.layout.fragment_change_email, 8);
        sparseIntArray.put(R.layout.fragment_chat, 9);
        sparseIntArray.put(R.layout.fragment_dark_diary, 10);
        sparseIntArray.put(R.layout.fragment_generate_bot_avatar, 11);
        sparseIntArray.put(R.layout.fragment_generate_bot_avatar_error, 12);
        sparseIntArray.put(R.layout.fragment_generating_bot_avatar_placeholder, 13);
        sparseIntArray.put(R.layout.fragment_light_diary, 14);
        sparseIntArray.put(R.layout.fragment_preview_send_image, 15);
        sparseIntArray.put(R.layout.fragment_reset, 16);
        sparseIntArray.put(R.layout.fragment_select_generated_avatar, 17);
        sparseIntArray.put(R.layout.fragment_user_age, 18);
        sparseIntArray.put(R.layout.fragment_user_gender, 19);
        sparseIntArray.put(R.layout.fragment_user_name, 20);
        sparseIntArray.put(R.layout.fragment_user_profile, 21);
        sparseIntArray.put(R.layout.fragment_user_profile_delete, 22);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/fragment_bot_age_0".equals(tag)) {
                        return new FragmentBotAgeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_age is invalid. Received: " + tag);
                case 2:
                    if ("layout/fragment_bot_ethnicity_0".equals(tag)) {
                        return new FragmentBotEthnicityBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_ethnicity is invalid. Received: " + tag);
                case 3:
                    if ("layout/fragment_bot_gender_0".equals(tag)) {
                        return new FragmentBotGenderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_gender is invalid. Received: " + tag);
                case 4:
                    if ("layout/fragment_bot_name_0".equals(tag)) {
                        return new FragmentBotNameBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_name is invalid. Received: " + tag);
                case 5:
                    if ("layout/fragment_bot_personality_0".equals(tag)) {
                        return new FragmentBotPersonalityBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_personality is invalid. Received: " + tag);
                case 6:
                    if ("layout/fragment_bot_voice_0".equals(tag)) {
                        return new FragmentBotVoiceBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bot_voice is invalid. Received: " + tag);
                case 7:
                    if ("layout/fragment_change_app_icon_0".equals(tag)) {
                        return new FragmentChangeAppIconBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_change_app_icon is invalid. Received: " + tag);
                case 8:
                    if ("layout/fragment_change_email_0".equals(tag)) {
                        return new FragmentChangeEmailBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_change_email is invalid. Received: " + tag);
                case 9:
                    if ("layout/fragment_chat_0".equals(tag)) {
                        return new FragmentChatBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
                case 10:
                    if ("layout/fragment_dark_diary_0".equals(tag)) {
                        return new FragmentDarkDiaryBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_dark_diary is invalid. Received: " + tag);
                case 11:
                    if ("layout/fragment_generate_bot_avatar_0".equals(tag)) {
                        return new FragmentGenerateBotAvatarBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_generate_bot_avatar is invalid. Received: " + tag);
                case 12:
                    if ("layout/fragment_generate_bot_avatar_error_0".equals(tag)) {
                        return new FragmentGenerateBotAvatarErrorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_generate_bot_avatar_error is invalid. Received: " + tag);
                case 13:
                    if ("layout/fragment_generating_bot_avatar_placeholder_0".equals(tag)) {
                        return new FragmentGeneratingBotAvatarPlaceholderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_generating_bot_avatar_placeholder is invalid. Received: " + tag);
                case 14:
                    if ("layout/fragment_light_diary_0".equals(tag)) {
                        return new FragmentLightDiaryBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_light_diary is invalid. Received: " + tag);
                case 15:
                    if ("layout/fragment_preview_send_image_0".equals(tag)) {
                        return new FragmentPreviewSendImageBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_preview_send_image is invalid. Received: " + tag);
                case 16:
                    if ("layout/fragment_reset_0".equals(tag)) {
                        return new FragmentResetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_reset is invalid. Received: " + tag);
                case 17:
                    if ("layout/fragment_select_generated_avatar_0".equals(tag)) {
                        return new FragmentSelectGeneratedAvatarBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_select_generated_avatar is invalid. Received: " + tag);
                case 18:
                    if ("layout/fragment_user_age_0".equals(tag)) {
                        return new FragmentUserAgeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_user_age is invalid. Received: " + tag);
                case 19:
                    if ("layout/fragment_user_gender_0".equals(tag)) {
                        return new FragmentUserGenderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_user_gender is invalid. Received: " + tag);
                case 20:
                    if ("layout/fragment_user_name_0".equals(tag)) {
                        return new FragmentUserNameBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_user_name is invalid. Received: " + tag);
                case 21:
                    if ("layout/fragment_user_profile_0".equals(tag)) {
                        return new FragmentUserProfileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_user_profile is invalid. Received: " + tag);
                case 22:
                    if ("layout/fragment_user_profile_delete_0".equals(tag)) {
                        return new FragmentUserProfileDeleteBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_user_profile_delete is invalid. Received: " + tag);
                default:
                    return null;
            }
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
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.analytics.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.animatedBackground.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.api.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.data.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.domain.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.chat.new_chat.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.core.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.data.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.icon_switcher.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.infrastructure.DataBinderMapperImpl());
        arrayList.add(new com.ifriend.popup.api.DataBinderMapperImpl());
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
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(22);
            sKeys = hashMap;
            hashMap.put("layout/fragment_bot_age_0", Integer.valueOf(R.layout.fragment_bot_age));
            hashMap.put("layout/fragment_bot_ethnicity_0", Integer.valueOf(R.layout.fragment_bot_ethnicity));
            hashMap.put("layout/fragment_bot_gender_0", Integer.valueOf(R.layout.fragment_bot_gender));
            hashMap.put("layout/fragment_bot_name_0", Integer.valueOf(R.layout.fragment_bot_name));
            hashMap.put("layout/fragment_bot_personality_0", Integer.valueOf(R.layout.fragment_bot_personality));
            hashMap.put("layout/fragment_bot_voice_0", Integer.valueOf(R.layout.fragment_bot_voice));
            hashMap.put("layout/fragment_change_app_icon_0", Integer.valueOf(R.layout.fragment_change_app_icon));
            hashMap.put("layout/fragment_change_email_0", Integer.valueOf(R.layout.fragment_change_email));
            hashMap.put("layout/fragment_chat_0", Integer.valueOf(R.layout.fragment_chat));
            hashMap.put("layout/fragment_dark_diary_0", Integer.valueOf(R.layout.fragment_dark_diary));
            hashMap.put("layout/fragment_generate_bot_avatar_0", Integer.valueOf(R.layout.fragment_generate_bot_avatar));
            hashMap.put("layout/fragment_generate_bot_avatar_error_0", Integer.valueOf(R.layout.fragment_generate_bot_avatar_error));
            hashMap.put("layout/fragment_generating_bot_avatar_placeholder_0", Integer.valueOf(R.layout.fragment_generating_bot_avatar_placeholder));
            hashMap.put("layout/fragment_light_diary_0", Integer.valueOf(R.layout.fragment_light_diary));
            hashMap.put("layout/fragment_preview_send_image_0", Integer.valueOf(R.layout.fragment_preview_send_image));
            hashMap.put("layout/fragment_reset_0", Integer.valueOf(R.layout.fragment_reset));
            hashMap.put("layout/fragment_select_generated_avatar_0", Integer.valueOf(R.layout.fragment_select_generated_avatar));
            hashMap.put("layout/fragment_user_age_0", Integer.valueOf(R.layout.fragment_user_age));
            hashMap.put("layout/fragment_user_gender_0", Integer.valueOf(R.layout.fragment_user_gender));
            hashMap.put("layout/fragment_user_name_0", Integer.valueOf(R.layout.fragment_user_name));
            hashMap.put("layout/fragment_user_profile_0", Integer.valueOf(R.layout.fragment_user_profile));
            hashMap.put("layout/fragment_user_profile_delete_0", Integer.valueOf(R.layout.fragment_user_profile_delete));
        }
    }
}
