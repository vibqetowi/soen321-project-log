package com.ifriend.domain.models.topics;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TopicsTheme.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/topics/TopicsTheme;", "", "Dark", "Light", "Lcom/ifriend/domain/models/topics/TopicsTheme$Dark;", "Lcom/ifriend/domain/models/topics/TopicsTheme$Light;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TopicsTheme {

    /* compiled from: TopicsTheme.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/topics/TopicsTheme$Light;", "Lcom/ifriend/domain/models/topics/TopicsTheme;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Light implements TopicsTheme {
        public static final Light INSTANCE = new Light();

        private Light() {
        }
    }

    /* compiled from: TopicsTheme.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/topics/TopicsTheme$Dark;", "Lcom/ifriend/domain/models/topics/TopicsTheme;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Dark implements TopicsTheme {
        public static final Dark INSTANCE = new Dark();

        private Dark() {
        }
    }
}
