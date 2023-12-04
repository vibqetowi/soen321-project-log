package com.ifriend.chat.presentation.di;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import com.ifriend.base.di.Feature;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.navigation.AppFlowCoordinatorImpl;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.BaseActivity;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivityModule.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/di/ActivityModule;", "", "()V", "provideAppCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "baseActivity", "Lcom/ifriend/ui/base/BaseActivity;", "provideAppFlowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "diaryScreenFactory", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenFactory;", "provideResources", "Landroid/content/res/Resources;", "activity", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ActivityModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final AppFlowCoordinator provideAppFlowCoordinator(RouterProvider router, ChatScreenFactory chatScreenFactory, InternalNotificationHandler internalNotificationHandler, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, DiaryScreenFactory diaryScreenFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(chatScreenFactory, "chatScreenFactory");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(diaryScreenFactory, "diaryScreenFactory");
        return new AppFlowCoordinatorImpl(router, chatScreenFactory, internalNotificationHandler, generateBotAvatarScreenFactory, diaryScreenFactory);
    }

    @Provides
    @Feature
    public final AppCompatActivity provideAppCompatActivity(BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        return baseActivity;
    }

    @Provides
    @Feature
    public final Resources provideResources(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Resources resources = activity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }
}
