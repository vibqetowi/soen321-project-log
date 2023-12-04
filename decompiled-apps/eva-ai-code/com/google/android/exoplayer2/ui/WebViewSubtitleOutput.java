package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.ui.SpannedToHtmlConverter;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertVerticalTypeToCss(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(this, context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
        if (r13 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
        if (r13 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0154, code lost:
        r21 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0156, code lost:
        r22 = com.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_TOP_KEY;
        r23 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateWebView() {
        String formatInvariant;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        Iterator it;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        String convertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        int i6 = 1;
        float f = CSS_LINE_HEIGHT;
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", HtmlUtils.toCssRgba(webViewSubtitleOutput.style.foregroundColor), convertTextSizeToCss, Float.valueOf((float) CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        HashMap hashMap = new HashMap();
        hashMap.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i7 = 0;
        while (i7 < webViewSubtitleOutput.textCues.size()) {
            Cue cue = webViewSubtitleOutput.textCues.get(i7);
            float f2 = cue.position != -3.4028235E38f ? cue.position * 100.0f : 50.0f;
            int anchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.positionAnchor);
            if (cue.line != -3.4028235E38f) {
                if (cue.lineType == i6) {
                    if (cue.line >= 0.0f) {
                        Object[] objArr = new Object[i6];
                        objArr[i5] = Float.valueOf(cue.line * f);
                        formatInvariant = Util.formatInvariant("%.2fem", objArr);
                        i = i5;
                        i2 = i;
                    } else {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i5] = Float.valueOf(((-cue.line) - 1.0f) * f);
                        formatInvariant = Util.formatInvariant("%.2fem", objArr2);
                        i = i5;
                        i2 = i6;
                    }
                    if (cue.size == -3.4028235E38f) {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i5] = Float.valueOf(cue.size * 100.0f);
                        str = Util.formatInvariant("%.2f%%", objArr3);
                    } else {
                        str = "fit-content";
                    }
                    String convertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                    String convertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                    String convertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                    String cssRgba = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
                    int i8 = i;
                    i3 = cue.verticalType;
                    String str3 = TtmlNode.RIGHT;
                    String str4 = "left";
                    String str5 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                    if (i3 == 1) {
                        if (i3 != 2) {
                            if (i2 != 0) {
                                str5 = "bottom";
                            }
                        }
                    }
                    if (cue.verticalType != 2 || cue.verticalType == 1) {
                        str2 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
                        i4 = i8;
                        i8 = anchorTypeToTranslatePercent;
                    } else {
                        str2 = ViewHierarchyConstants.DIMENSION_WIDTH_KEY;
                        i4 = anchorTypeToTranslatePercent;
                    }
                    SpannedToHtmlConverter.HtmlAndCss convert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                    it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        String str6 = (String) it.next();
                        SpannedToHtmlConverter.HtmlAndCss htmlAndCss = convert;
                        String str7 = (String) hashMap.put(str6, (String) hashMap.get(str6));
                        Assertions.checkState(str7 == null || str7.equals(hashMap.get(str6)));
                        it = it2;
                        convert = htmlAndCss;
                    }
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = convert;
                    sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i7), str4, Float.valueOf(f2), str5, formatInvariant, str2, str, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss2, cssRgba, Integer.valueOf(i4), Integer.valueOf(i8), getBlockShearTransformFunction(cue)));
                    sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                    if (cue.multiRowAlignment == null) {
                        sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(cue.multiRowAlignment)));
                        sb.append(htmlAndCss2.html);
                        sb.append("</span>");
                    } else {
                        sb.append(htmlAndCss2.html);
                    }
                    sb.append("</span></div>");
                    i7++;
                    f = CSS_LINE_HEIGHT;
                    i5 = 0;
                    webViewSubtitleOutput = this;
                    i6 = 1;
                } else {
                    Object[] objArr4 = new Object[i6];
                    objArr4[i5] = Float.valueOf(cue.line * 100.0f);
                    formatInvariant = Util.formatInvariant("%.2f%%", objArr4);
                    if (cue.verticalType == i6) {
                        i = -anchorTypeToTranslatePercent(cue.lineAnchor);
                    } else {
                        i = anchorTypeToTranslatePercent(cue.lineAnchor);
                    }
                }
            } else {
                Object[] objArr5 = new Object[i6];
                objArr5[i5] = Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                formatInvariant = Util.formatInvariant("%.2f%%", objArr5);
                i = -100;
            }
            i2 = i5;
            if (cue.size == -3.4028235E38f) {
            }
            String convertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String convertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String convertTextSizeToCss22 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            String cssRgba2 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
            int i82 = i;
            i3 = cue.verticalType;
            String str32 = TtmlNode.RIGHT;
            String str42 = "left";
            String str52 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            if (i3 == 1) {
            }
            if (cue.verticalType != 2) {
            }
            str2 = ViewHierarchyConstants.DIMENSION_HEIGHT_KEY;
            i4 = i82;
            i82 = anchorTypeToTranslatePercent;
            SpannedToHtmlConverter.HtmlAndCss convert2 = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = hashMap.keySet().iterator();
            while (it.hasNext()) {
            }
            SpannedToHtmlConverter.HtmlAndCss htmlAndCss22 = convert2;
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i7), str42, Float.valueOf(f2), str52, formatInvariant, str2, str, convertAlignmentToCss2, convertVerticalTypeToCss2, convertTextSizeToCss22, cssRgba2, Integer.valueOf(i4), Integer.valueOf(i82), getBlockShearTransformFunction(cue)));
            sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            if (cue.multiRowAlignment == null) {
            }
            sb.append("</span></div>");
            i7++;
            f = CSS_LINE_HEIGHT;
            i5 = 0;
            webViewSubtitleOutput = this;
            i6 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder("<html><head><style>");
        for (String str8 : hashMap.keySet()) {
            sb2.append(str8);
            sb2.append("{");
            sb2.append((String) hashMap.get(str8));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.UTF_8), 1), "text/html", HttpHeaders.Values.BASE64);
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        if (cue.shearDegrees != 0.0f) {
            return Util.formatInvariant("%s(%.2fdeg)", (cue.verticalType == 2 || cue.verticalType == 1) ? "skewY" : "skewX", Float.valueOf(cue.shearDegrees));
        }
        return "";
    }

    private String convertTextSizeToCss(int i, float f) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return resolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
                }
                return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
            }
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        return i != 1 ? i != 2 ? TtmlNode.CENTER : TtmlNode.END : TtmlNode.START;
    }
}
