package com.ifriend.ui.internalNotifications;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
/* compiled from: SnackbarPresentation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "", "Blured", "BluredError", "Congratulation", "Deprecated", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Blured;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$BluredError;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Congratulation;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Deprecated;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SnackbarPresentation {

    /* compiled from: SnackbarPresentation.kt */
    @kotlin.Deprecated(level = DeprecationLevel.WARNING, message = "Переходим на Blured, если в дизайне старый вариант, то нужно уточнять у дизайнера")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Deprecated;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Deprecated implements SnackbarPresentation {
        public static final int $stable = 0;
        public static final Deprecated INSTANCE = new Deprecated();

        private Deprecated() {
        }
    }

    /* compiled from: SnackbarPresentation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$BluredError;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BluredError implements SnackbarPresentation {
        public static final int $stable = 0;
        public static final BluredError INSTANCE = new BluredError();

        private BluredError() {
        }
    }

    /* compiled from: SnackbarPresentation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Blured;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Blured implements SnackbarPresentation {
        public static final int $stable = 0;
        public static final Blured INSTANCE = new Blured();

        private Blured() {
        }
    }

    /* compiled from: SnackbarPresentation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarPresentation$Congratulation;", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Congratulation implements SnackbarPresentation {
        public static final int $stable = 0;
        public static final Congratulation INSTANCE = new Congratulation();

        private Congratulation() {
        }
    }
}
