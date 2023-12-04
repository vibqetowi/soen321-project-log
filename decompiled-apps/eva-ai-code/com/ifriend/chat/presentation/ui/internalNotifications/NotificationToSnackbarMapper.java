package com.ifriend.chat.presentation.ui.internalNotifications;

import android.content.res.Resources;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.chat.reset.AiHasBeenResetInternalNotification;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.R;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.notifications.IncorrectImageFormat;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.notifications.UnableToSendImage;
import com.ifriend.domain.socket.notifications.AccountUpgraded;
import com.ifriend.domain.socket.notifications.ActivationTopicErrorNotification;
import com.ifriend.domain.socket.notifications.AvatarsGeneratedNotification;
import com.ifriend.domain.socket.notifications.ChangingAppIconAvailable;
import com.ifriend.domain.socket.notifications.ConfirmationEmailSentNotification;
import com.ifriend.domain.socket.notifications.DailyNeuronsNotification;
import com.ifriend.domain.socket.notifications.EmailConfirmedNotification;
import com.ifriend.domain.socket.notifications.EmailNotChangedNotification;
import com.ifriend.domain.socket.notifications.GenerationAvatarAnimationErrorNotification;
import com.ifriend.domain.socket.notifications.LevelUpdateCongratulationNotification;
import com.ifriend.domain.socket.notifications.LevelUpdateMessageNotification;
import com.ifriend.domain.socket.notifications.NeuronsAddedNotification;
import com.ifriend.domain.socket.notifications.ReviewSentNotification;
import com.ifriend.domain.socket.notifications.SomethingWentWrongErrorNotification;
import com.ifriend.domain.socket.notifications.UnableToOpenAddNeuronsScreen;
import com.ifriend.domain.socket.notifications.UnableToOpenUpgradeScreen;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.presentation.common.internalnotification.DefaultErrorMessage;
import com.ifriend.presentation.common.internalnotification.DefaultMessageInternalNotification;
import com.ifriend.presentation.features.chat.panel.notification.LullabyRemindLater;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import com.ifriend.ui.internalNotifications.SnackbarPresentation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NotificationToSnackbarMapper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/internalNotifications/NotificationToSnackbarMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "resources", "Landroid/content/res/Resources;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "(Landroid/content/res/Resources;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;)V", "generateAvatarsGeneratedSnackbarDescription", "notification", "Lcom/ifriend/domain/socket/notifications/AvatarsGeneratedNotification;", "map", "from", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapper implements Mapper<InternalNotification, SnackbarDescription> {
    public static final int $stable = 8;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final Resources resources;
    private final RouterProvider router;

    @Inject
    public NotificationToSnackbarMapper(Resources resources, RouterProvider router, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        this.resources = resources;
        this.router = router;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
    }

    @Override // com.ifriend.domain.data.Mapper
    public SnackbarDescription map(InternalNotification from) {
        SnackbarDescription snackbarDescription;
        Intrinsics.checkNotNullParameter(from, "from");
        if (from instanceof AccountUpgraded) {
            return new SnackbarDescription(this.resources, R.string.internal_notification_account_upgraded, null, SnackbarPresentation.Deprecated.INSTANCE, null, null, null, 0, null, 500, null);
        }
        if (from instanceof AiHasBeenResetInternalNotification) {
            String string = this.resources.getString(R.string.ai_has_been_reset, ((AiHasBeenResetInternalNotification) from).getBotName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            snackbarDescription = new SnackbarDescription(string, (String) null, SnackbarPresentation.Deprecated.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 122, (DefaultConstructorMarker) null);
        } else if (from instanceof AvatarsGeneratedNotification) {
            return generateAvatarsGeneratedSnackbarDescription((AvatarsGeneratedNotification) from);
        } else {
            if (from instanceof GenerationAvatarAnimationErrorNotification) {
                return NotificationToSnackbarMapperKt.generationAvatarAnimationErrorSnackbar(this.resources);
            }
            if (from instanceof LevelUpdateCongratulationNotification) {
                String string2 = this.resources.getString(R.string.level_up_snackbar_title, Integer.valueOf(((LevelUpdateCongratulationNotification) from).getNewLevel()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                snackbarDescription = new SnackbarDescription(string2, (String) null, SnackbarPresentation.Congratulation.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 122, (DefaultConstructorMarker) null);
            } else if (from instanceof LevelUpdateMessageNotification) {
                snackbarDescription = new SnackbarDescription(((LevelUpdateMessageNotification) from).getMessage(), (String) null, SnackbarPresentation.Deprecated.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 122, (DefaultConstructorMarker) null);
            } else if (from instanceof ChangingAppIconAvailable) {
                return new SnackbarDescription(this.resources, R.string.internal_notification_premium_icon_available_title, Integer.valueOf(R.string.internal_notification_premium_icon_available_body), SnackbarPresentation.Deprecated.INSTANCE, null, null, null, 0, null, 496, null);
            } else {
                if (from instanceof ReviewSentNotification) {
                    return new SnackbarDescription(this.resources, R.string.review_sent_notification_title, null, SnackbarPresentation.Blured.INSTANCE, null, null, null, 0, null, 500, null);
                }
                if (from instanceof ConfirmationEmailSentNotification) {
                    String string3 = this.resources.getString(R.string.confirmation_email_sent, ((ConfirmationEmailSentNotification) from).getEmail());
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    snackbarDescription = new SnackbarDescription(string3, (String) null, SnackbarPresentation.Deprecated.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 122, (DefaultConstructorMarker) null);
                } else if (from instanceof DailyNeuronsNotification) {
                    String string4 = this.resources.getString(R.string.internal_notification_daily_neurons_title, Integer.valueOf(((DailyNeuronsNotification) from).getAmount()));
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    snackbarDescription = new SnackbarDescription(string4, this.resources.getString(R.string.internal_notification_daily_neurons_body), SnackbarPresentation.Deprecated.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 120, (DefaultConstructorMarker) null);
                } else if (from instanceof EmailConfirmedNotification) {
                    return new SnackbarDescription(this.resources, R.string.email_confirmed, null, SnackbarPresentation.Deprecated.INSTANCE, null, null, null, 0, null, 500, null);
                } else {
                    if (from instanceof EmailNotChangedNotification) {
                        return new SnackbarDescription(this.resources, R.string.email_was_not_changed, null, SnackbarPresentation.BluredError.INSTANCE, null, null, null, 0, null, 500, null);
                    }
                    if (from instanceof IncorrectImageFormat) {
                        return new SnackbarDescription(this.resources, R.string.incorrect_format_select_another_image, null, SnackbarPresentation.BluredError.INSTANCE, null, null, null, 0, null, 500, null);
                    }
                    if (from instanceof NeuronsAddedNotification) {
                        String string5 = this.resources.getString(R.string.internal_notification_neurons_added, Integer.valueOf(((NeuronsAddedNotification) from).getAmount()));
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        snackbarDescription = new SnackbarDescription(string5, (String) null, SnackbarPresentation.Deprecated.INSTANCE, (Function0) null, (Function0) null, (Function1) null, 0, 122, (DefaultConstructorMarker) null);
                    } else if (from instanceof UnableToOpenAddNeuronsScreen) {
                        return new SnackbarDescription(this.resources, R.string.error_unable_open_add_neurons_screen, null, SnackbarPresentation.Deprecated.INSTANCE, null, null, null, 0, null, 500, null);
                    } else {
                        if (from instanceof UnableToOpenUpgradeScreen) {
                            return new SnackbarDescription(this.resources, R.string.error_unable_upgrade_screen, null, SnackbarPresentation.Deprecated.INSTANCE, null, null, null, 0, null, 500, null);
                        }
                        if (from instanceof UnableToSendImage) {
                            return new SnackbarDescription(this.resources, R.string.the_image_could_not_be_sent, null, SnackbarPresentation.BluredError.INSTANCE, null, null, null, 0, null, 500, null);
                        }
                        if (from instanceof ActivationTopicErrorNotification ? true : from instanceof SomethingWentWrongErrorNotification) {
                            return new SnackbarDescription(this.resources, R.string.topic_activation_error, null, SnackbarPresentation.BluredError.INSTANCE, null, null, null, 0, null, 500, null);
                        }
                        if (from instanceof DefaultErrorMessage) {
                            return new SnackbarDescription(this.resources, com.ifriend.ui.R.string.errors__default_error, null, SnackbarPresentation.Blured.INSTANCE, null, null, null, 0, null, 500, null);
                        }
                        if (from instanceof DefaultMessageInternalNotification) {
                            snackbarDescription = new SnackbarDescription(this.resources, com.ifriend.ui.R.string.errors__default_error, null, SnackbarPresentation.Blured.INSTANCE, null, null, null, 0, ((DefaultMessageInternalNotification) from).getMessage(), 244, null);
                        } else if (from instanceof LullabyRemindLater) {
                            return new SnackbarDescription(this.resources, com.ifriend.presentation.R.string.chat_panel__premium_topic_popup__notification, null, SnackbarPresentation.Blured.INSTANCE, null, null, null, 0, null, 500, null);
                        } else {
                            return null;
                        }
                    }
                }
            }
        }
        return snackbarDescription;
    }

    private final SnackbarDescription generateAvatarsGeneratedSnackbarDescription(AvatarsGeneratedNotification avatarsGeneratedNotification) {
        if (avatarsGeneratedNotification.isSuccess()) {
            Resources resources = this.resources;
            int i = R.string.avatars_has_been_generated;
            int i2 = R.string.tap_to_choose_new_avatar;
            return new SnackbarDescription(resources, i, Integer.valueOf(i2), SnackbarPresentation.Deprecated.INSTANCE, new NotificationToSnackbarMapper$generateAvatarsGeneratedSnackbarDescription$1(this), null, null, 10000, null, 352, null);
        }
        return new SnackbarDescription(this.resources, R.string.whoops_couldnt_create_avatars, Integer.valueOf(R.string.tap_to_try_again), SnackbarPresentation.BluredError.INSTANCE, new NotificationToSnackbarMapper$generateAvatarsGeneratedSnackbarDescription$2(this, avatarsGeneratedNotification), null, null, 10000, null, 352, null);
    }
}
