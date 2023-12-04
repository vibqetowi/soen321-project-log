package com.ifriend.chat.new_chat.list.mapper;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.ui.model.DateSeparatorUiModel;
import com.ifriend.domain.newChat.chat.systems.dateSeparator.DateSeparatorComponent;
import com.ifriend.ui.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatEntityToDateUiModelMapper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToDateUiModelMapper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dateSeparatorText", "", AnalyticsConstants.TIMESTAMP, "", "isYesterday", "", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/DateSeparatorUiModel;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/systems/dateSeparator/DateSeparatorComponent;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToDateUiModelMapper {
    private final Context context;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SimpleDateFormat format = new SimpleDateFormat("EEE d MMM", Locale.US);

    @Inject
    public ChatEntityToDateUiModelMapper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* compiled from: ChatEntityToDateUiModelMapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToDateUiModelMapper$Companion;", "", "()V", "format", "Ljava/text/SimpleDateFormat;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final DateSeparatorUiModel map(DateSeparatorComponent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new DateSeparatorUiModel(dateSeparatorText(content.getTimestamp()), content.getTimestamp());
    }

    private final String dateSeparatorText(long j) {
        if (DateUtils.isToday(j)) {
            String string = this.context.getString(R.string.today);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        } else if (isYesterday(j)) {
            String string2 = this.context.getString(R.string.yesterday);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        } else {
            String upperCase = format.format(Long.valueOf(j)).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase;
        }
    }

    private final boolean isYesterday(long j) {
        return DateUtils.isToday(j + 86400000);
    }
}
