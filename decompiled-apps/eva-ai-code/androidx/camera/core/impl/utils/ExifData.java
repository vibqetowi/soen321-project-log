package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
/* loaded from: classes.dex */
public class ExifData {
    private static final boolean DEBUG = false;
    static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    private static final ExifTag[] IFD_EXIF_TAGS;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final String TAG = "ExifData";
    static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final HashSet<String> sTagSetForCompatibility;
    private final List<Map<String, ExifAttribute>> mAttributes;
    private final ByteOrder mByteOrder;

    /* loaded from: classes.dex */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(ExifInterface.TAG_MAKE, 271, 2), new ExifTag(ExifInterface.TAG_MODEL, 272, 2), new ExifTag(ExifInterface.TAG_ORIENTATION, 274, 3), new ExifTag(ExifInterface.TAG_X_RESOLUTION, 282, 5), new ExifTag(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new ExifTag(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(ExifInterface.TAG_SOFTWARE, 305, 2), new ExifTag(ExifInterface.TAG_DATETIME, 306, 2), new ExifTag(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(ExifInterface.TAG_F_NUMBER, 33437, 5), new ExifTag(ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new ExifTag(ExifInterface.TAG_EXIF_VERSION, 36864, 2), new ExifTag(ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new ExifTag(ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(ExifInterface.TAG_METERING_MODE, 37383, 3), new ExifTag(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(ExifInterface.TAG_FLASH, 37385, 3), new ExifTag(ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new ExifTag(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(ExifInterface.TAG_SENSING_METHOD, 41495, 3), new ExifTag(ExifInterface.TAG_FILE_SOURCE, 41728, 7), new ExifTag(ExifInterface.TAG_SCENE_TYPE, 41729, 7), new ExifTag(ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new ExifTag(ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(ExifInterface.TAG_CONTRAST, 41992, 3), new ExifTag(ExifInterface.TAG_SATURATION, 41993, 3), new ExifTag(ExifInterface.TAG_SHARPNESS, 41994, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new ExifTag(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new ExifTag(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new ExifTag(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new ExifTag(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        ExifTag[] exifTagArr4 = {new ExifTag(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_GPS_TIMESTAMP));
    }

    ExifData(ByteOrder byteOrder, List<Map<String, ExifAttribute>> list) {
        Preconditions.checkState(list.size() == EXIF_TAGS.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public ByteOrder getByteOrder() {
        return this.mByteOrder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, ExifAttribute> getAttributes(int i) {
        int length = EXIF_TAGS.length;
        Preconditions.checkArgumentInRange(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(i);
    }

    public String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                if (exifAttribute.format != 5 && exifAttribute.format != 10) {
                    Logger.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                LongRational[] longRationalArr = (LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr == null || longRationalArr.length != 3) {
                    Logger.w(TAG, "Invalid GPS Timestamp array. array=" + Arrays.toString(longRationalArr));
                    return null;
                }
                return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (((float) longRationalArr[0].getNumerator()) / ((float) longRationalArr[0].getDenominator()))), Integer.valueOf((int) (((float) longRationalArr[1].getNumerator()) / ((float) longRationalArr[1].getDenominator()))), Integer.valueOf((int) (((float) longRationalArr[2].getNumerator()) / ((float) longRationalArr[2].getDenominator()))));
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private ExifAttribute getExifAttribute(String str) {
        if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            ExifAttribute exifAttribute = this.mAttributes.get(i).get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public static Builder builderForDevice() {
        return new Builder(ByteOrder.BIG_ENDIAN).setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(1)).setAttribute(ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_RESOLUTION_UNIT, String.valueOf(2)).setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING, String.valueOf(1)).setAttribute(ExifInterface.TAG_MAKE, Build.MANUFACTURER).setAttribute(ExifInterface.TAG_MODEL, Build.MODEL);
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final List<Map<String, ExifAttribute>> mAttributes = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        });
        private final ByteOrder mByteOrder;
        private static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final List<HashMap<String, ExifTag>> sExifTagMapsForWriting = Collections.list(new Enumeration<HashMap<String, ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, ExifTag> nextElement() {
                ExifTag[] exifTagArr;
                HashMap<String, ExifTag> hashMap = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    hashMap.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return hashMap;
            }
        });

        Builder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public Builder setImageWidth(int i) {
            return setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
        }

        public Builder setImageHeight(int i) {
            return setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i));
        }

        public Builder setOrientationDegrees(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                Logger.w(ExifData.TAG, "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i2));
        }

        public Builder setFlashState(CameraCaptureMetaData.FlashState flashState) {
            int i;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i2 = AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[flashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                Logger.w(ExifData.TAG, "Unknown flash state: " + flashState);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                setAttribute(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(4));
            }
            return setAttribute(ExifInterface.TAG_FLASH, String.valueOf(i));
        }

        public Builder setExposureTimeNanos(long j) {
            return setAttribute(ExifInterface.TAG_EXPOSURE_TIME, String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        public Builder setLensFNumber(float f) {
            return setAttribute(ExifInterface.TAG_F_NUMBER, String.valueOf(f));
        }

        public Builder setIso(int i) {
            return setAttribute(ExifInterface.TAG_SENSITIVITY_TYPE, String.valueOf(3)).setAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i)));
        }

        public Builder setFocalLength(float f) {
            return setAttribute(ExifInterface.TAG_FOCAL_LENGTH, new LongRational(f * 1000.0f, 1000L).toString());
        }

        public Builder setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) {
            String valueOf;
            int i = AnonymousClass1.$SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode[whiteBalanceMode.ordinal()];
            if (i == 1) {
                valueOf = String.valueOf(0);
            } else {
                valueOf = i != 2 ? null : String.valueOf(1);
            }
            return setAttribute(ExifInterface.TAG_WHITE_BALANCE, valueOf);
        }

        public Builder setAttribute(String str, String str2) {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public Builder removeAttribute(String str) {
            setAttributeInternal(str, null, this.mAttributes);
            return this;
        }

        private void setAttributeIfMissing(String str, String str2, List<Map<String, ExifAttribute>> list) {
            for (Map<String, ExifAttribute> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void setAttributeInternal(String str, String str2, List<Map<String, ExifAttribute>> list) {
            int i;
            int i2;
            int i3;
            Matcher matcher;
            Builder builder = this;
            String str3 = str;
            String str4 = str2;
            if ((ExifInterface.TAG_DATETIME.equals(str3) || ExifInterface.TAG_DATETIME_ORIGINAL.equals(str3) || ExifInterface.TAG_DATETIME_DIGITIZED.equals(str3)) && str4 != null) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str4).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    Logger.w(ExifData.TAG, "Invalid value for " + str3 + " : " + str4);
                    return;
                } else if (find2) {
                    str4 = str4.replaceAll("-", CertificateUtil.DELIMITER);
                }
            }
            if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str3)) {
                str3 = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            String str5 = str3;
            int i4 = 2;
            int i5 = 1;
            if (str4 != null && ExifData.sTagSetForCompatibility.contains(str5)) {
                if (str5.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                    if (!GPS_TIMESTAMP_PATTERN.matcher(str4).find()) {
                        Logger.w(ExifData.TAG, "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    str4 = Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(1))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(2))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(3))) + "/1";
                } else {
                    try {
                        str4 = new LongRational(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException e) {
                        Logger.w(ExifData.TAG, "Invalid value for " + str5 + " : " + str4, e);
                        return;
                    }
                }
            }
            int i6 = 0;
            int i7 = 0;
            while (i7 < ExifData.EXIF_TAGS.length) {
                ExifTag exifTag = sExifTagMapsForWriting.get(i7).get(str5);
                if (exifTag != null) {
                    if (str4 == null) {
                        list.get(i7).remove(str5);
                    } else {
                        Pair<Integer, Integer> guessDataFormat = guessDataFormat(str4);
                        if (exifTag.primaryFormat == ((Integer) guessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) guessDataFormat.second).intValue()) {
                            i3 = exifTag.primaryFormat;
                        } else if (exifTag.secondaryFormat != -1 && (exifTag.secondaryFormat == ((Integer) guessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) guessDataFormat.second).intValue())) {
                            i3 = exifTag.secondaryFormat;
                        } else if (exifTag.primaryFormat == i5 || exifTag.primaryFormat == 7 || exifTag.primaryFormat == i4) {
                            i3 = exifTag.primaryFormat;
                        }
                        String str6 = RemoteSettings.FORWARD_SLASH_STRING;
                        switch (i3) {
                            case 1:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str5, ExifAttribute.createByte(str4));
                                break;
                            case 2:
                            case 7:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str5, ExifAttribute.createString(str4));
                                break;
                            case 3:
                                i = i7;
                                i2 = i5;
                                String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i8 = 0; i8 < split.length; i8++) {
                                    iArr[i8] = Integer.parseInt(split[i8]);
                                }
                                list.get(i).put(str5, ExifAttribute.createUShort(iArr, builder.mByteOrder));
                                break;
                            case 4:
                                i = i7;
                                i2 = i5;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i9 = 0; i9 < split2.length; i9++) {
                                    jArr[i9] = Long.parseLong(split2[i9]);
                                }
                                list.get(i).put(str5, ExifAttribute.createULong(jArr, builder.mByteOrder));
                                break;
                            case 5:
                                String str7 = RemoteSettings.FORWARD_SLASH_STRING;
                                String[] split3 = str4.split(",", -1);
                                LongRational[] longRationalArr = new LongRational[split3.length];
                                int i10 = i6;
                                while (i10 < split3.length) {
                                    String str8 = str7;
                                    String[] split4 = split3[i10].split(str8, -1);
                                    longRationalArr[i10] = new LongRational((long) Double.parseDouble(split4[i6]), (long) Double.parseDouble(split4[1]));
                                    i10++;
                                    str7 = str8;
                                    i7 = i7;
                                    i6 = 0;
                                }
                                i = i7;
                                i2 = 1;
                                list.get(i).put(str5, ExifAttribute.createURational(longRationalArr, builder.mByteOrder));
                                break;
                            case 9:
                                String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i11 = i6; i11 < split5.length; i11++) {
                                    iArr2[i11] = Integer.parseInt(split5[i11]);
                                }
                                list.get(i7).put(str5, ExifAttribute.createSLong(iArr2, builder.mByteOrder));
                                i = i7;
                                i2 = 1;
                                break;
                            case 10:
                                String[] split6 = str4.split(",", -1);
                                LongRational[] longRationalArr2 = new LongRational[split6.length];
                                int i12 = i6;
                                while (i12 < split6.length) {
                                    String[] split7 = split6[i12].split(str6, -1);
                                    longRationalArr2[i12] = new LongRational((long) Double.parseDouble(split7[i6]), (long) Double.parseDouble(split7[i5]));
                                    i12++;
                                    str6 = str6;
                                    i5 = 1;
                                }
                                builder = this;
                                list.get(i7).put(str5, ExifAttribute.createSRational(longRationalArr2, builder.mByteOrder));
                                i = i7;
                                i2 = 1;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i13 = i6; i13 < split8.length; i13++) {
                                    dArr[i13] = Double.parseDouble(split8[i13]);
                                }
                                list.get(i7).put(str5, ExifAttribute.createDouble(dArr, builder.mByteOrder));
                                break;
                        }
                        i7 = i + 1;
                        i5 = i2;
                        i4 = 2;
                        i6 = 0;
                    }
                }
                i = i7;
                i2 = i5;
                i7 = i + 1;
                i5 = i2;
                i4 = 2;
                i6 = 0;
            }
        }

        public ExifData build() {
            ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = Collections.enumeration(Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public Map<String, ExifAttribute> nextElement() {
                    return new HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_EXPOSURE_PROGRAM, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(ExifInterface.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                setAttributeIfMissing(ExifInterface.TAG_METERING_MODE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, String.valueOf(2), list);
                setAttributeIfMissing(ExifInterface.TAG_FILE_SOURCE, String.valueOf(3), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_TYPE, String.valueOf(1), list);
                setAttributeIfMissing(ExifInterface.TAG_CUSTOM_RENDERED, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_CAPTURE_TYPE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_CONTRAST, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SATURATION, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SHARPNESS, String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new ExifData(this.mByteOrder, list);
        }

        private static Pair<Integer, Integer> guessDataFormat(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> guessDataFormat = guessDataFormat(split[0]);
                if (((Integer) guessDataFormat.first).intValue() == 2) {
                    return guessDataFormat;
                }
                for (int i = 1; i < split.length; i++) {
                    Pair<Integer, Integer> guessDataFormat2 = guessDataFormat(split[i]);
                    int intValue = (((Integer) guessDataFormat2.first).equals(guessDataFormat.first) || ((Integer) guessDataFormat2.second).equals(guessDataFormat.first)) ? ((Integer) guessDataFormat.first).intValue() : -1;
                    int intValue2 = (((Integer) guessDataFormat.second).intValue() == -1 || !(((Integer) guessDataFormat2.first).equals(guessDataFormat.second) || ((Integer) guessDataFormat2.second).equals(guessDataFormat.second))) ? -1 : ((Integer) guessDataFormat.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        guessDataFormat = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        guessDataFormat = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return guessDataFormat;
            } else if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                String[] split2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i2 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i2 < 0 || parseLong > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            if (i2 < 0) {
                                return new Pair<>(9, -1);
                            }
                            return new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused2) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused3) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.ExifData$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode = iArr;
            try {
                iArr[WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode[WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData.FlashState.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = iArr2;
            try {
                iArr2[CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
