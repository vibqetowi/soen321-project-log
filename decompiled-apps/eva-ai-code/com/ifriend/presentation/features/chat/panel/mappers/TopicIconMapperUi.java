package com.ifriend.presentation.features.chat.panel.mappers;

import com.ifriend.presentation.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TopicIconMapperUi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/mappers/TopicIconMapperUi;", "", "()V", "map", "", "iconName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicIconMapperUi {
    public static final int $stable = 0;

    public final Integer map(String iconName) {
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        switch (iconName.hashCode()) {
            case -2021494524:
                if (iconName.equals("playing-cards")) {
                    return Integer.valueOf(R.drawable.ic_topic_role_play);
                }
                break;
            case -429810013:
                if (iconName.equals("egg-plant")) {
                    return Integer.valueOf(R.drawable.ic_topic_adult_toys);
                }
                break;
            case 3321920:
                if (iconName.equals("lips")) {
                    return Integer.valueOf(R.drawable.ic_topic_lips_travelling);
                }
                break;
            case 3444116:
                if (iconName.equals("plum")) {
                    return Integer.valueOf(R.drawable.ic_topic_food);
                }
                break;
            case 56295154:
                if (iconName.equals("handcuffs")) {
                    return Integer.valueOf(R.drawable.ic_topic_adult_games);
                }
                break;
            case 92670943:
                if (iconName.equals("adore")) {
                    return Integer.valueOf(R.drawable.ic_topic_spicy);
                }
                break;
            case 95858532:
                if (iconName.equals("drops")) {
                    return Integer.valueOf(R.drawable.ic_droplets);
                }
                break;
            case 97513267:
                if (iconName.equals("flame")) {
                    return Integer.valueOf(R.drawable.ic_topic_passion);
                }
                break;
            case 98619139:
                if (iconName.equals("green")) {
                    return Integer.valueOf(R.drawable.ic_topic_family);
                }
                break;
            case 99151942:
                if (iconName.equals("heart")) {
                    return Integer.valueOf(R.drawable.ic_topic_love);
                }
                break;
            case 104079552:
                if (iconName.equals("money")) {
                    return Integer.valueOf(R.drawable.ic_topic_money);
                }
                break;
        }
        return null;
    }
}
