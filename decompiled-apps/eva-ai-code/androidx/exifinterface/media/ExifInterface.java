package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterfaceUtils;
import coil.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
/* loaded from: classes3.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    static final Charset ASCII;
    static final short BYTE_ALIGN_II = 18761;
    static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN;
    private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final Pattern GPS_TIMESTAMP_PATTERN;
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final ExifTag[] IFD_EXIF_TAGS;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final int IFD_OFFSET = 8;
    private static final ExifTag[] IFD_THUMBNAIL_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    static final int IFD_TYPE_PREVIEW = 5;
    static final int IFD_TYPE_PRIMARY = 0;
    static final int IFD_TYPE_THUMBNAIL = 4;
    static final int IMAGE_TYPE_ARW = 1;
    static final int IMAGE_TYPE_CR2 = 2;
    static final int IMAGE_TYPE_DNG = 3;
    static final int IMAGE_TYPE_HEIF = 12;
    static final int IMAGE_TYPE_JPEG = 4;
    static final int IMAGE_TYPE_NEF = 5;
    static final int IMAGE_TYPE_NRW = 6;
    static final int IMAGE_TYPE_ORF = 7;
    static final int IMAGE_TYPE_PEF = 8;
    static final int IMAGE_TYPE_PNG = 13;
    static final int IMAGE_TYPE_RAF = 9;
    static final int IMAGE_TYPE_RW2 = 10;
    static final int IMAGE_TYPE_SRW = 11;
    static final int IMAGE_TYPE_UNKNOWN = 0;
    static final int IMAGE_TYPE_WEBP = 14;
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    static final byte MARKER = -1;
    static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final Pattern NON_ZERO_TIME_PATTERN;
    private static final ExifTag[] ORF_CAMERA_SETTINGS_TAGS;
    private static final ExifTag[] ORF_IMAGE_PROCESSING_TAGS;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final ExifTag[] ORF_MAKER_NOTE_TAGS;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final String PEF_SIGNATURE = "PENTAX";
    private static final ExifTag[] PEF_TAGS;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    private static final int SKIP_BUFFER_SIZE = 8192;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final ExifTag TAG_RAF_IMAGE_SIZE;
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte WEBP_VP8L_SIGNATURE = 47;
    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;
    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final HashMap<Integer, Integer> sExifPointerTagMap;
    private static final HashMap<Integer, ExifTag>[] sExifTagMapsForReading;
    private static final HashMap<String, ExifTag>[] sExifTagMapsForWriting;
    private static SimpleDateFormat sFormatterPrimary;
    private static SimpleDateFormat sFormatterSecondary;
    private static final HashSet<String> sTagSetForCompatibility;
    private boolean mAreThumbnailStripsConsecutive;
    private AssetManager.AssetInputStream mAssetInputStream;
    private final HashMap<String, ExifAttribute>[] mAttributes;
    private Set<Integer> mAttributesOffsets;
    private ByteOrder mExifByteOrder;
    private String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private boolean mXmpIsFromSeparateMarker;
    private static final String TAG = "ExifInterface";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final List<Integer> ROTATION_ORDER = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> FLIPPED_ROTATION_ORDER = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    private static final byte MARKER_SOI = -40;
    static final byte[] JPEG_SIGNATURE = {-1, MARKER_SOI, -1};
    private static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    private static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, 49};
    private static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] PNG_SIGNATURE = {-119, 80, 78, 71, 13, 10, Ascii.SUB, 10};
    private static final byte[] PNG_CHUNK_TYPE_EXIF = {101, 88, 73, 102};
    private static final byte[] PNG_CHUNK_TYPE_IHDR = {73, 72, 68, 82};
    private static final byte[] PNG_CHUNK_TYPE_IEND = {73, 69, 78, 68};
    private static final byte[] WEBP_SIGNATURE_1 = {82, 73, 70, 70};
    private static final byte[] WEBP_SIGNATURE_2 = {87, 69, 66, 80};
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = {69, 88, 73, 70};
    static final byte START_CODE = 42;
    private static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, START_CODE};
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IfdType {
    }

    private static boolean isSupportedFormatForSavingAttributes(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    private static boolean shouldSupportSeek(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    static {
        ExifTag[] exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, 273, 3, 4), new ExifTag(TAG_ORIENTATION, 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new ExifTag(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new ExifTag(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new ExifTag(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new ExifTag(TAG_RW2_ISO, 23, 3), new ExifTag(TAG_RW2_JPG_FROM_RAW, 46, 7), new ExifTag(TAG_XMP, 700, 1)};
        IFD_TIFF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(TAG_F_NUMBER, 33437, 5), new ExifTag(TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new ExifTag(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(TAG_OECF, 34856, 7), new ExifTag(TAG_SENSITIVITY_TYPE, 34864, 3), new ExifTag(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new ExifTag(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new ExifTag(TAG_ISO_SPEED, 34867, 4), new ExifTag(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new ExifTag(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new ExifTag(TAG_EXIF_VERSION, 36864, 2), new ExifTag(TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(TAG_OFFSET_TIME, 36880, 2), new ExifTag(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new ExifTag(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new ExifTag(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new ExifTag(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(TAG_APERTURE_VALUE, 37378, 5), new ExifTag(TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(TAG_SUBJECT_DISTANCE, 37382, 5), new ExifTag(TAG_METERING_MODE, 37383, 3), new ExifTag(TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(TAG_FLASH, 37385, 3), new ExifTag(TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(TAG_SUBJECT_AREA, 37396, 3), new ExifTag(TAG_MAKER_NOTE, 37500, 7), new ExifTag(TAG_USER_COMMENT, 37510, 7), new ExifTag(TAG_SUBSEC_TIME, 37520, 2), new ExifTag(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(TAG_COLOR_SPACE, 40961, 3), new ExifTag(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_RELATED_SOUND_FILE, 40964, 2), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_FLASH_ENERGY, 41483, 5), new ExifTag(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new ExifTag(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new ExifTag(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new ExifTag(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(TAG_SUBJECT_LOCATION, 41492, 3), new ExifTag(TAG_EXPOSURE_INDEX, 41493, 5), new ExifTag(TAG_SENSING_METHOD, 41495, 3), new ExifTag(TAG_FILE_SOURCE, 41728, 7), new ExifTag(TAG_SCENE_TYPE, 41729, 7), new ExifTag(TAG_CFA_PATTERN, 41730, 7), new ExifTag(TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(TAG_WHITE_BALANCE, 41987, 3), new ExifTag(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new ExifTag(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new ExifTag(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(TAG_GAIN_CONTROL, 41991, 3), new ExifTag(TAG_CONTRAST, 41992, 3), new ExifTag(TAG_SATURATION, 41993, 3), new ExifTag(TAG_SHARPNESS, 41994, 3), new ExifTag(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new ExifTag(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new ExifTag(TAG_IMAGE_UNIQUE_ID, 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag(TAG_BODY_SERIAL_NUMBER, 42033, 2), new ExifTag(TAG_LENS_SPECIFICATION, 42034, 5), new ExifTag(TAG_LENS_MAKE, 42035, 2), new ExifTag(TAG_LENS_MODEL, 42036, 2), new ExifTag(TAG_GAMMA, 42240, 5), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_EXIF_TAGS = exifTagArr3;
        ExifTag[] exifTagArr4 = {new ExifTag(TAG_GPS_VERSION_ID, 0, 1), new ExifTag(TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(TAG_GPS_ALTITUDE, 6, 5), new ExifTag(TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(TAG_GPS_SATELLITES, 8, 2), new ExifTag(TAG_GPS_STATUS, 9, 2), new ExifTag(TAG_GPS_MEASURE_MODE, 10, 2), new ExifTag(TAG_GPS_DOP, 11, 5), new ExifTag(TAG_GPS_SPEED_REF, 12, 2), new ExifTag(TAG_GPS_SPEED, 13, 5), new ExifTag(TAG_GPS_TRACK_REF, 14, 2), new ExifTag(TAG_GPS_TRACK, 15, 5), new ExifTag(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(TAG_GPS_IMG_DIRECTION, 17, 5), new ExifTag(TAG_GPS_MAP_DATUM, 18, 2), new ExifTag(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new ExifTag(TAG_GPS_DEST_LATITUDE, 20, 5), new ExifTag(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new ExifTag(TAG_GPS_DEST_LONGITUDE, 22, 5), new ExifTag(TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(TAG_GPS_DEST_BEARING, 24, 5), new ExifTag(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new ExifTag(TAG_GPS_DEST_DISTANCE, 26, 5), new ExifTag(TAG_GPS_PROCESSING_METHOD, 27, 7), new ExifTag(TAG_GPS_AREA_INFORMATION, 28, 7), new ExifTag(TAG_GPS_DATESTAMP, 29, 2), new ExifTag(TAG_GPS_DIFFERENTIAL, 30, 3), new ExifTag(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        IFD_GPS_TAGS = exifTagArr4;
        ExifTag[] exifTagArr5 = {new ExifTag(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr5;
        ExifTag[] exifTagArr6 = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, 273, 3, 4), new ExifTag(TAG_THUMBNAIL_ORIENTATION, 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = exifTagArr6;
        TAG_RAF_IMAGE_SIZE = new ExifTag(TAG_STRIP_OFFSETS, 273, 3);
        ExifTag[] exifTagArr7 = {new ExifTag(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 4), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 4)};
        ORF_MAKER_NOTE_TAGS = exifTagArr7;
        ExifTag[] exifTagArr8 = {new ExifTag(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new ExifTag(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        ORF_CAMERA_SETTINGS_TAGS = exifTagArr8;
        ExifTag[] exifTagArr9 = {new ExifTag(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = exifTagArr9;
        ExifTag[] exifTagArr10 = {new ExifTag(TAG_COLOR_SPACE, 55, 3)};
        PEF_TAGS = exifTagArr10;
        ExifTag[][] exifTagArr11 = {exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr6, exifTagArr2, exifTagArr7, exifTagArr8, exifTagArr9, exifTagArr10};
        EXIF_TAGS = exifTagArr11;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 1), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 1)};
        sExifTagMapsForReading = new HashMap[exifTagArr11.length];
        sExifTagMapsForWriting = new HashMap[exifTagArr11.length];
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        sExifPointerTagMap = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        sFormatterPrimary = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        sFormatterSecondary = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ExifTag[][] exifTagArr12 = EXIF_TAGS;
            if (i < exifTagArr12.length) {
                sExifTagMapsForReading[i] = new HashMap<>();
                sExifTagMapsForWriting[i] = new HashMap<>();
                for (ExifTag exifTag : exifTagArr12[i]) {
                    sExifTagMapsForReading[i].put(Integer.valueOf(exifTag.number), exifTag);
                    sExifTagMapsForWriting[i].put(exifTag.name, exifTag);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = sExifPointerTagMap;
                ExifTag[] exifTagArr13 = EXIF_POINTER_TAGS;
                hashMap.put(Integer.valueOf(exifTagArr13[0].number), 5);
                hashMap.put(Integer.valueOf(exifTagArr13[1].number), 1);
                hashMap.put(Integer.valueOf(exifTagArr13[2].number), 2);
                hashMap.put(Integer.valueOf(exifTagArr13[3].number), 3);
                hashMap.put(Integer.valueOf(exifTagArr13[4].number), 7);
                hashMap.put(Integer.valueOf(exifTagArr13[5].number), 8);
                NON_ZERO_TIME_PATTERN = Pattern.compile(".*[1-9].*");
                GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Rational {
        public final long denominator;
        public final long numerator;

        Rational(double d) {
            this((long) (d * 10000.0d), HandlingStrategy.DEFAULT_TTL);
        }

        Rational(long j, long j2) {
            if (j2 == 0) {
                this.numerator = 0L;
                this.denominator = 1L;
                return;
            }
            this.numerator = j;
            this.denominator = j2;
        }

        public String toString() {
            return this.numerator + RemoteSettings.FORWARD_SLASH_STRING + this.denominator;
        }

        public double calculate() {
            return this.numerator / this.denominator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        ExifAttribute(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        ExifAttribute(int i, int i2, long j, byte[] bArr) {
            this.format = i;
            this.numberOfComponents = i2;
            this.bytesOffset = j;
            this.bytes = bArr;
        }

        public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new ExifAttribute(3, iArr.length, wrap.array());
        }

        public static ExifAttribute createUShort(int i, ByteOrder byteOrder) {
            return createUShort(new int[]{i}, byteOrder);
        }

        public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new ExifAttribute(4, jArr.length, wrap.array());
        }

        public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
            return createULong(new long[]{j}, byteOrder);
        }

        public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new ExifAttribute(9, iArr.length, wrap.array());
        }

        public static ExifAttribute createSLong(int i, ByteOrder byteOrder) {
            return createSLong(new int[]{i}, byteOrder);
        }

        public static ExifAttribute createByte(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(ExifInterface.ASCII);
            return new ExifAttribute(1, bytes.length, bytes);
        }

        public static ExifAttribute createString(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.ASCII);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public static ExifAttribute createURational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * rationalArr.length]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createURational(Rational rational, ByteOrder byteOrder) {
            return createURational(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute createSRational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * rationalArr.length]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(10, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createSRational(Rational rational, ByteOrder byteOrder) {
            return createSRational(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new ExifAttribute(12, dArr.length, wrap.array());
        }

        public static ExifAttribute createDouble(double d, ByteOrder byteOrder) {
            return createDouble(new double[]{d}, byteOrder);
        }

        public String toString() {
            return "(" + ExifInterface.IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:177:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Object getValue(ByteOrder byteOrder) {
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            ByteOrderedDataInputStream byteOrderedDataInputStream2;
            byte b;
            byte b2;
            ByteOrderedDataInputStream byteOrderedDataInputStream3 = null;
            try {
                try {
                    byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.bytes);
                    try {
                        byteOrderedDataInputStream.setByteOrder(byteOrder);
                        int i = 0;
                        boolean z = true;
                        switch (this.format) {
                            case 1:
                            case 6:
                                byte[] bArr = this.bytes;
                                if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                    String str = new String(bArr, ExifInterface.ASCII);
                                    try {
                                        byteOrderedDataInputStream.close();
                                    } catch (IOException e) {
                                        Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e2) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.numberOfComponents >= ExifInterface.EXIF_ASCII_PREFIX.length) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < ExifInterface.EXIF_ASCII_PREFIX.length) {
                                            if (this.bytes[i2] != ExifInterface.EXIF_ASCII_PREFIX[i2]) {
                                                z = false;
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        i = ExifInterface.EXIF_ASCII_PREFIX.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (i < this.numberOfComponents && (b2 = this.bytes[i]) != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i++;
                                }
                                String sb2 = sb.toString();
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e3) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e3);
                                }
                                return sb2;
                            case 3:
                                int[] iArr = new int[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    iArr[i] = byteOrderedDataInputStream.readUnsignedShort();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e4) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    jArr[i] = byteOrderedDataInputStream.readUnsignedInt();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e5) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                Rational[] rationalArr = new Rational[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    rationalArr[i] = new Rational(byteOrderedDataInputStream.readUnsignedInt(), byteOrderedDataInputStream.readUnsignedInt());
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e6) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e6);
                                }
                                return rationalArr;
                            case 8:
                                int[] iArr2 = new int[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    iArr2[i] = byteOrderedDataInputStream.readShort();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e7) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    iArr3[i] = byteOrderedDataInputStream.readInt();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e8) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                Rational[] rationalArr2 = new Rational[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    rationalArr2[i] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e9) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e9);
                                }
                                return rationalArr2;
                            case 11:
                                double[] dArr = new double[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    dArr[i] = byteOrderedDataInputStream.readFloat();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e10) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.numberOfComponents];
                                while (i < this.numberOfComponents) {
                                    dArr2[i] = byteOrderedDataInputStream.readDouble();
                                    i++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e11) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
                            default:
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e12) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w(ExifInterface.TAG, "IOException occurred during reading a value", e);
                        if (byteOrderedDataInputStream != null) {
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e14) {
                                Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteOrderedDataInputStream3 = byteOrderedDataInputStream2;
                    if (byteOrderedDataInputStream3 != null) {
                        try {
                            byteOrderedDataInputStream3.close();
                        } catch (IOException e15) {
                            Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                byteOrderedDataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (byteOrderedDataInputStream3 != null) {
                }
                throw th;
            }
        }

        public double getDoubleValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (value instanceof String) {
                return Double.parseDouble((String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (value instanceof Rational[]) {
                Rational[] rationalArr = (Rational[]) value;
                if (rationalArr.length == 1) {
                    return rationalArr[0].calculate();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }

        public int getIntValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (value instanceof String) {
                return Integer.parseInt((String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }

        public String getStringValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof Rational[]) {
                Rational[] rationalArr = (Rational[]) value;
                while (i < rationalArr.length) {
                    sb.append(rationalArr[i].numerator);
                    sb.append('/');
                    sb.append(rationalArr[i].denominator);
                    i++;
                    if (i != rationalArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        public int size() {
            return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        ExifTag(String str, int i, int i2) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = -1;
        }

        ExifTag(String str, int i, int i2, int i3) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = i3;
        }

        boolean isFormatCompatible(int i) {
            int i2;
            int i3 = this.primaryFormat;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.secondaryFormat) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    public ExifInterface(File file) throws IOException {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        initForFilename(file.getAbsolutePath());
    }

    public ExifInterface(String str) throws IOException {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        initForFilename(str);
    }

    public ExifInterface(FileDescriptor fileDescriptor) throws IOException {
        boolean z;
        FileInputStream fileInputStream;
        Throwable th;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.mAssetInputStream = null;
        this.mFilename = null;
        if (isSeekableFD(fileDescriptor)) {
            this.mSeekableFileDescriptor = fileDescriptor;
            try {
                fileDescriptor = ExifInterfaceUtils.Api21Impl.dup(fileDescriptor);
                z = true;
            } catch (Exception e) {
                throw new IOException("Failed to duplicate file descriptor", e);
            }
        } else {
            this.mSeekableFileDescriptor = null;
            z = false;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
            try {
                loadAttributes(fileInputStream);
                ExifInterfaceUtils.closeQuietly(fileInputStream);
                if (z) {
                    ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                }
            } catch (Throwable th2) {
                th = th2;
                ExifInterfaceUtils.closeQuietly(fileInputStream);
                if (z) {
                    ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public ExifInterface(InputStream inputStream, int i) throws IOException {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.mFilename = null;
        if (i == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, IDENTIFIER_EXIF_APP1.length);
            if (!isExifDataOnly(bufferedInputStream)) {
                Log.w(TAG, "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.mIsExifDataOnly = true;
            this.mAssetInputStream = null;
            this.mSeekableFileDescriptor = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.mAssetInputStream = (AssetManager.AssetInputStream) inputStream;
            this.mSeekableFileDescriptor = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (isSeekableFD(fileInputStream.getFD())) {
                    this.mAssetInputStream = null;
                    this.mSeekableFileDescriptor = fileInputStream.getFD();
                }
            }
            this.mAssetInputStream = null;
            this.mSeekableFileDescriptor = null;
        }
        loadAttributes(inputStream);
    }

    public static boolean isSupportedMimeType(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals(Utils.MIME_TYPE_HEIC)) {
                    c = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals(Utils.MIME_TYPE_HEIF)) {
                    c = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals(Utils.MIME_TYPE_WEBP)) {
                    c = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c = '\b';
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c = '\t';
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c = '\n';
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c = '\f';
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c = '\r';
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    private ExifAttribute getExifAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            if (DEBUG) {
                Log.d(TAG, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            ExifAttribute exifAttribute = this.mAttributes[i].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public String getAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                if (exifAttribute.format != 5 && exifAttribute.format != 10) {
                    Log.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w(TAG, "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) rationalArr[0].numerator) / ((float) rationalArr[0].denominator))), Integer.valueOf((int) (((float) rationalArr[1].numerator) / ((float) rationalArr[1].denominator))), Integer.valueOf((int) (((float) rationalArr[2].numerator) / ((float) rationalArr[2].denominator))));
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int getAttributeInt(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return i;
        }
        try {
            return exifAttribute.getIntValue(this.mExifByteOrder);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public double getAttributeDouble(String str, double d) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return d;
        }
        try {
            return exifAttribute.getDoubleValue(this.mExifByteOrder);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public void setAttribute(String str, String str2) {
        ExifTag exifTag;
        int i;
        int i2;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((TAG_DATETIME.equals(str3) || TAG_DATETIME_ORIGINAL.equals(str3) || TAG_DATETIME_DIGITIZED.equals(str3)) && str4 != null) {
            boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str4).find();
            boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w(TAG, "Invalid value for " + str3 + " : " + str4);
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", CertificateUtil.DELIMITER);
            }
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str3)) {
            if (DEBUG) {
                Log.d(TAG, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i3 = 2;
        int i4 = 1;
        if (str4 != null && sTagSetForCompatibility.contains(str3)) {
            if (str3.equals(TAG_GPS_TIMESTAMP)) {
                if (!GPS_TIMESTAMP_PATTERN.matcher(str4).find()) {
                    Log.w(TAG, "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new Rational(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < EXIF_TAGS.length) {
            if ((i6 != 4 || this.mHasThumbnail) && (exifTag = sExifTagMapsForWriting[i6].get(str3)) != null) {
                if (str4 == null) {
                    this.mAttributes[i6].remove(str3);
                } else {
                    Pair<Integer, Integer> guessDataFormat = guessDataFormat(str4);
                    int i7 = -1;
                    if (exifTag.primaryFormat == ((Integer) guessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) guessDataFormat.second).intValue()) {
                        i = exifTag.primaryFormat;
                    } else if (exifTag.secondaryFormat != -1 && (exifTag.secondaryFormat == ((Integer) guessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) guessDataFormat.second).intValue())) {
                        i = exifTag.secondaryFormat;
                    } else if (exifTag.primaryFormat == i4 || exifTag.primaryFormat == 7 || exifTag.primaryFormat == i3) {
                        i = exifTag.primaryFormat;
                    } else if (DEBUG) {
                        StringBuilder sb = new StringBuilder("Given tag (");
                        sb.append(str3);
                        sb.append(") value didn't match with one of expected formats: ");
                        String[] strArr = IFD_FORMAT_NAMES;
                        sb.append(strArr[exifTag.primaryFormat]);
                        sb.append(exifTag.secondaryFormat == -1 ? "" : ", " + strArr[exifTag.secondaryFormat]);
                        sb.append(" (guess: ");
                        sb.append(strArr[((Integer) guessDataFormat.first).intValue()]);
                        sb.append(((Integer) guessDataFormat.second).intValue() != -1 ? ", " + strArr[((Integer) guessDataFormat.second).intValue()] : "");
                        sb.append(")");
                        Log.d(TAG, sb.toString());
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.mAttributes[i6].put(str3, ExifAttribute.createByte(str4));
                            break;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.mAttributes[i6].put(str3, ExifAttribute.createString(str4));
                            break;
                        case 3:
                            i2 = i4;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i8 = 0; i8 < split.length; i8++) {
                                iArr[i8] = Integer.parseInt(split[i8]);
                            }
                            this.mAttributes[i6].put(str3, ExifAttribute.createUShort(iArr, this.mExifByteOrder));
                            break;
                        case 4:
                            i2 = i4;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i9 = 0; i9 < split2.length; i9++) {
                                jArr[i9] = Long.parseLong(split2[i9]);
                            }
                            this.mAttributes[i6].put(str3, ExifAttribute.createULong(jArr, this.mExifByteOrder));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            Rational[] rationalArr = new Rational[split3.length];
                            int i10 = 0;
                            while (i10 < split3.length) {
                                String[] split4 = split3[i10].split(RemoteSettings.FORWARD_SLASH_STRING, i7);
                                rationalArr[i10] = new Rational((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i10++;
                                i7 = -1;
                            }
                            i2 = 1;
                            this.mAttributes[i6].put(str3, ExifAttribute.createURational(rationalArr, this.mExifByteOrder));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i2 = i4;
                            if (DEBUG) {
                                Log.d(TAG, "Data format isn't one of expected formats: " + i);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i11 = 0; i11 < split5.length; i11++) {
                                iArr2[i11] = Integer.parseInt(split5[i11]);
                            }
                            this.mAttributes[i6].put(str3, ExifAttribute.createSLong(iArr2, this.mExifByteOrder));
                            i2 = 1;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            Rational[] rationalArr2 = new Rational[split6.length];
                            int i12 = i5;
                            while (i12 < split6.length) {
                                String[] split7 = split6[i12].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                rationalArr2[i12] = new Rational((long) Double.parseDouble(split7[i5]), (long) Double.parseDouble(split7[i4]));
                                i12++;
                                split6 = split6;
                                i5 = 0;
                                i4 = 1;
                            }
                            this.mAttributes[i6].put(str3, ExifAttribute.createSRational(rationalArr2, this.mExifByteOrder));
                            i2 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i13 = i5; i13 < split8.length; i13++) {
                                dArr[i13] = Double.parseDouble(split8[i13]);
                            }
                            this.mAttributes[i6].put(str3, ExifAttribute.createDouble(dArr, this.mExifByteOrder));
                            break;
                    }
                    i6++;
                    i4 = i2;
                    i3 = 2;
                    i5 = 0;
                }
            }
            i2 = i4;
            i6++;
            i4 = i2;
            i3 = 2;
            i5 = 0;
        }
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    public void rotate(int i) {
        if (i % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        List<Integer> list = ROTATION_ORDER;
        if (list.contains(Integer.valueOf(attributeInt))) {
            int indexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = FLIPPED_ROTATION_ORDER;
            if (list2.contains(Integer.valueOf(attributeInt))) {
                int indexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(r4));
    }

    public void flipVertically() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    public void flipHorizontally() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    private void removeAttribute(String str) {
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            this.mAttributes[i].remove(str);
        }
    }

    private void loadAttributes(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            try {
                try {
                    this.mAttributes[i] = new HashMap<>();
                } finally {
                    addDefaultValuesForCompatibility();
                    if (DEBUG) {
                        printAttributes();
                    }
                }
            } catch (IOException | UnsupportedOperationException e) {
                boolean z = DEBUG;
                if (z) {
                    Log.w(TAG, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                addDefaultValuesForCompatibility();
                if (!z) {
                    return;
                }
            }
        }
        if (!this.mIsExifDataOnly) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            this.mMimeType = getMimeType(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (shouldSupportSeek(this.mMimeType)) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (this.mIsExifDataOnly) {
                getStandaloneAttributes(seekableByteOrderedDataInputStream);
            } else {
                int i2 = this.mMimeType;
                if (i2 == 12) {
                    getHeifAttributes(seekableByteOrderedDataInputStream);
                } else if (i2 == 7) {
                    getOrfAttributes(seekableByteOrderedDataInputStream);
                } else if (i2 == 10) {
                    getRw2Attributes(seekableByteOrderedDataInputStream);
                } else {
                    getRawAttributes(seekableByteOrderedDataInputStream);
                }
            }
            seekableByteOrderedDataInputStream.seek(this.mOffsetToExifData);
            setThumbnailData(seekableByteOrderedDataInputStream);
        } else {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
            int i3 = this.mMimeType;
            if (i3 == 4) {
                getJpegAttributes(byteOrderedDataInputStream, 0, 0);
            } else if (i3 == 13) {
                getPngAttributes(byteOrderedDataInputStream);
            } else if (i3 == 9) {
                getRafAttributes(byteOrderedDataInputStream);
            } else if (i3 == 14) {
                getWebpAttributes(byteOrderedDataInputStream);
            }
        }
    }

    private static boolean isSeekableFD(FileDescriptor fileDescriptor) {
        try {
            ExifInterfaceUtils.Api21Impl.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (DEBUG) {
                Log.d(TAG, "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    private void printAttributes() {
        for (int i = 0; i < this.mAttributes.length; i++) {
            Log.d(TAG, "The size of tag group[" + i + "]: " + this.mAttributes[i].size());
            for (Map.Entry<String, ExifAttribute> entry : this.mAttributes[i].entrySet()) {
                ExifAttribute value = entry.getValue();
                Log.d(TAG, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.getStringValue(this.mExifByteOrder) + "'");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb A[Catch: all -> 0x0113, Exception -> 0x0116, TryCatch #19 {Exception -> 0x0116, all -> 0x0113, blocks: (B:64:0x00e7, B:66:0x00eb, B:68:0x0101, B:67:0x00fa), top: B:130:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[Catch: all -> 0x0113, Exception -> 0x0116, TryCatch #19 {Exception -> 0x0116, all -> 0x0113, blocks: (B:64:0x00e7, B:66:0x00eb, B:68:0x0101, B:67:0x00fa), top: B:130:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void saveAttributes() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Exception exc;
        FileOutputStream fileOutputStream2;
        InputStream inputStream;
        Exception e;
        FileOutputStream fileOutputStream3;
        FileInputStream fileInputStream2;
        if (!isSupportedFormatForSavingAttributes(this.mMimeType)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.mSeekableFileDescriptor == null && this.mFilename == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.mHasThumbnail && this.mHasThumbnailStrips && !this.mAreThumbnailStripsConsecutive) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        boolean z = true;
        this.mModified = true;
        this.mThumbnailBytes = getThumbnail();
        FileInputStream fileInputStream3 = null;
        try {
            File createTempFile = File.createTempFile("temp", "tmp");
            if (this.mFilename != null) {
                fileInputStream = new FileInputStream(this.mFilename);
            } else {
                ExifInterfaceUtils.Api21Impl.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.mSeekableFileDescriptor);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    ExifInterfaceUtils.copy(fileInputStream, fileOutputStream);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    ExifInterfaceUtils.closeQuietly(fileOutputStream);
                    boolean z2 = false;
                    try {
                        try {
                            try {
                                fileInputStream2 = new FileInputStream(createTempFile);
                                try {
                                    if (this.mFilename != null) {
                                        fileOutputStream2 = new FileOutputStream(this.mFilename);
                                    } else {
                                        ExifInterfaceUtils.Api21Impl.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.mSeekableFileDescriptor);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream2);
                                    } catch (Exception e2) {
                                        bufferedOutputStream = null;
                                        fileInputStream3 = fileInputStream2;
                                        exc = e2;
                                        bufferedInputStream = null;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    bufferedInputStream = null;
                                    bufferedOutputStream = null;
                                    fileInputStream3 = fileInputStream2;
                                    exc = e;
                                    fileOutputStream2 = bufferedOutputStream;
                                    try {
                                        inputStream = new FileInputStream(createTempFile);
                                        try {
                                            if (this.mFilename == null) {
                                                fileOutputStream3 = new FileOutputStream(this.mFilename);
                                            } else {
                                                ExifInterfaceUtils.Api21Impl.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                                fileOutputStream3 = new FileOutputStream(this.mSeekableFileDescriptor);
                                            }
                                            fileOutputStream2 = fileOutputStream3;
                                            ExifInterfaceUtils.copy(inputStream, fileOutputStream2);
                                            ExifInterfaceUtils.closeQuietly(inputStream);
                                            ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                            throw new IOException("Failed to save new file", exc);
                                        } catch (Exception e4) {
                                            e = e4;
                                            try {
                                                throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                                            } catch (Throwable th) {
                                                th = th;
                                                fileInputStream3 = inputStream;
                                                try {
                                                    ExifInterfaceUtils.closeQuietly(fileInputStream3);
                                                    ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z2 = z;
                                                    fileInputStream3 = bufferedInputStream;
                                                    ExifInterfaceUtils.closeQuietly(fileInputStream3);
                                                    ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                                                    if (!z2) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = false;
                                            fileInputStream3 = inputStream;
                                            ExifInterfaceUtils.closeQuietly(fileInputStream3);
                                            ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        inputStream = fileInputStream3;
                                        e = e5;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z = false;
                                        ExifInterfaceUtils.closeQuietly(fileInputStream3);
                                        ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                        throw th;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                bufferedInputStream = null;
                                bufferedOutputStream = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                            ExifInterfaceUtils.closeQuietly(fileInputStream3);
                            ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                            if (!z2) {
                                createTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                        try {
                            int i = this.mMimeType;
                            if (i == 4) {
                                saveJpegAttributes(bufferedInputStream, bufferedOutputStream);
                            } else if (i == 13) {
                                savePngAttributes(bufferedInputStream, bufferedOutputStream);
                            } else if (i == 14) {
                                saveWebpAttributes(bufferedInputStream, bufferedOutputStream);
                            }
                            ExifInterfaceUtils.closeQuietly(bufferedInputStream);
                            ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                            createTempFile.delete();
                            this.mThumbnailBytes = null;
                        } catch (Exception e7) {
                            exc = e7;
                            fileInputStream3 = fileInputStream2;
                            inputStream = new FileInputStream(createTempFile);
                            if (this.mFilename == null) {
                            }
                            fileOutputStream2 = fileOutputStream3;
                            ExifInterfaceUtils.copy(inputStream, fileOutputStream2);
                            ExifInterfaceUtils.closeQuietly(inputStream);
                            ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                            throw new IOException("Failed to save new file", exc);
                        }
                    } catch (Exception e8) {
                        bufferedOutputStream = null;
                        fileInputStream3 = fileInputStream2;
                        exc = e8;
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedOutputStream = null;
                        fileInputStream3 = bufferedInputStream;
                        ExifInterfaceUtils.closeQuietly(fileInputStream3);
                        ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                        if (!z2) {
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileInputStream3 = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        ExifInterfaceUtils.closeQuietly(fileInputStream3);
                        ExifInterfaceUtils.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    fileInputStream3 = fileInputStream;
                    ExifInterfaceUtils.closeQuietly(fileInputStream3);
                    ExifInterfaceUtils.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public boolean hasThumbnail() {
        return this.mHasThumbnail;
    }

    public boolean hasAttribute(String str) {
        return getExifAttribute(str) != null;
    }

    public byte[] getThumbnail() {
        int i = this.mThumbnailCompression;
        if (i == 6 || i == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[Catch: Exception -> 0x008a, all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x008a, blocks: (B:28:0x0051, B:31:0x0067, B:33:0x0073, B:38:0x007e, B:39:0x0083, B:40:0x0084, B:41:0x0089, B:44:0x008c, B:45:0x0091), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[Catch: Exception -> 0x008a, all -> 0x00af, TryCatch #3 {Exception -> 0x008a, blocks: (B:28:0x0051, B:31:0x0067, B:33:0x0073, B:38:0x007e, B:39:0x0083, B:40:0x0084, B:41:0x0089, B:44:0x008c, B:45:0x0091), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getThumbnailBytes() {
        FileDescriptor fileDescriptor;
        FileInputStream fileInputStream;
        Exception e;
        FileDescriptor fileDescriptor2;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Closeable closeable = null;
        if (!this.mHasThumbnail) {
            return null;
        }
        ?? r1 = this.mThumbnailBytes;
        try {
            if (r1 != 0) {
                return r1;
            }
            try {
                r1 = this.mAssetInputStream;
                try {
                    if (r1 != 0) {
                        try {
                            if (!r1.markSupported()) {
                                Log.d(TAG, "Cannot read thumbnail from inputstream without mark/reset support");
                                ExifInterfaceUtils.closeQuietly(r1);
                                return null;
                            }
                            r1.reset();
                            fileInputStream3 = r1;
                        } catch (Exception e2) {
                            e = e2;
                            fileDescriptor2 = null;
                            fileInputStream = r1;
                            Log.d(TAG, "Encountered exception while getting thumbnail", e);
                            ExifInterfaceUtils.closeQuietly(fileInputStream);
                            if (fileDescriptor2 != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptor = null;
                            closeable = r1;
                            ExifInterfaceUtils.closeQuietly(closeable);
                            if (fileDescriptor != null) {
                            }
                            throw th;
                        }
                    } else if (this.mFilename == null) {
                        FileDescriptor dup = ExifInterfaceUtils.Api21Impl.dup(this.mSeekableFileDescriptor);
                        try {
                            ExifInterfaceUtils.Api21Impl.lseek(dup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor2 = dup;
                            fileInputStream2 = new FileInputStream(dup);
                            if (fileInputStream2 == null) {
                                if (fileInputStream2.skip(this.mThumbnailOffset + this.mOffsetToExifData) == this.mThumbnailOffset + this.mOffsetToExifData) {
                                    byte[] bArr = new byte[this.mThumbnailLength];
                                    if (fileInputStream2.read(bArr) == this.mThumbnailLength) {
                                        this.mThumbnailBytes = bArr;
                                        ExifInterfaceUtils.closeQuietly(fileInputStream2);
                                        if (fileDescriptor2 != null) {
                                            ExifInterfaceUtils.closeFileDescriptor(fileDescriptor2);
                                        }
                                        return bArr;
                                    }
                                    throw new IOException("Corrupted image");
                                }
                                throw new IOException("Corrupted image");
                            }
                            throw new FileNotFoundException();
                        } catch (Exception e3) {
                            e = e3;
                            fileDescriptor2 = dup;
                            fileInputStream = null;
                            Log.d(TAG, "Encountered exception while getting thumbnail", e);
                            ExifInterfaceUtils.closeQuietly(fileInputStream);
                            if (fileDescriptor2 != null) {
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileDescriptor = dup;
                            ExifInterfaceUtils.closeQuietly(closeable);
                            if (fileDescriptor != null) {
                                ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                            }
                            throw th;
                        }
                    } else {
                        fileInputStream3 = new FileInputStream(this.mFilename);
                    }
                    if (fileInputStream2 == null) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileInputStream = fileInputStream2;
                    Log.d(TAG, "Encountered exception while getting thumbnail", e);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (fileDescriptor2 != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor2);
                    }
                    return null;
                }
                fileDescriptor2 = null;
                fileInputStream2 = fileInputStream3;
            } catch (Exception e5) {
                fileInputStream = null;
                e = e5;
                fileDescriptor2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileDescriptor = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public Bitmap getThumbnailBitmap() {
        if (this.mHasThumbnail) {
            if (this.mThumbnailBytes == null) {
                this.mThumbnailBytes = getThumbnailBytes();
            }
            int i = this.mThumbnailCompression;
            if (i == 6 || i == 7) {
                return BitmapFactory.decodeByteArray(this.mThumbnailBytes, 0, this.mThumbnailLength);
            }
            if (i == 1) {
                int length = this.mThumbnailBytes.length / 3;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    byte[] bArr = this.mThumbnailBytes;
                    int i3 = i2 * 3;
                    iArr[i2] = (bArr[i3] << Ascii.DLE) + 0 + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
                }
                ExifAttribute exifAttribute = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
                ExifAttribute exifAttribute2 = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
                if (exifAttribute != null && exifAttribute2 != null) {
                    return Bitmap.createBitmap(iArr, exifAttribute2.getIntValue(this.mExifByteOrder), exifAttribute.getIntValue(this.mExifByteOrder), Bitmap.Config.ARGB_8888);
                }
            }
            return null;
        }
        return null;
    }

    public boolean isThumbnailCompressed() {
        if (this.mHasThumbnail) {
            int i = this.mThumbnailCompression;
            return i == 6 || i == 7;
        }
        return false;
    }

    public long[] getThumbnailRange() {
        if (this.mModified) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (this.mHasThumbnail) {
            if (!this.mHasThumbnailStrips || this.mAreThumbnailStripsConsecutive) {
                return new long[]{this.mThumbnailOffset + this.mOffsetToExifData, this.mThumbnailLength};
            }
            return null;
        }
        return null;
    }

    public long[] getAttributeRange(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.mModified) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return new long[]{exifAttribute.bytesOffset, exifAttribute.bytes.length};
        }
        return null;
    }

    public byte[] getAttributeBytes(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.bytes;
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, new Rational((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = sFormatterPrimary.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, split[0]);
        setAttribute(TAG_GPS_TIMESTAMP, split[1]);
    }

    public void setLatLong(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            setAttribute(TAG_GPS_LATITUDE_REF, d >= 0.0d ? "N" : LATITUDE_SOUTH);
            setAttribute(TAG_GPS_LATITUDE, convertDecimalDegree(Math.abs(d)));
            setAttribute(TAG_GPS_LONGITUDE_REF, d2 >= 0.0d ? LONGITUDE_EAST : LONGITUDE_WEST);
            setAttribute(TAG_GPS_LONGITUDE, convertDecimalDegree(Math.abs(d2)));
        }
    }

    public double getAltitude(double d) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d;
        }
        return attributeDouble * (attributeInt != 1 ? 1 : -1);
    }

    public void setAltitude(double d) {
        String str = d >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, new Rational(Math.abs(d)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setDateTime(Long l) {
        if (l == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String l2 = Long.toString(l.longValue() % 1000);
        for (int length = l2.length(); length < 3; length++) {
            l2 = "0" + l2;
        }
        setAttribute(TAG_DATETIME, sFormatterPrimary.format(new Date(l.longValue())));
        setAttribute(TAG_SUBSEC_TIME, l2);
    }

    public Long getDateTime() {
        return parseDateTime(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    public Long getDateTimeDigitized() {
        return parseDateTime(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    public Long getDateTimeOriginal() {
        return parseDateTime(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    private static Long parseDateTime(String str, String str2, String str3) {
        if (str != null && NON_ZERO_TIME_PATTERN.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = sFormatterPrimary.parse(str, parsePosition);
                if (parse == null && (parse = sFormatterSecondary.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i = 1;
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(substring) || "-".equals(substring)) && CertificateUtil.DELIMITER.equals(str3.substring(3, 4)) && parseInt <= 14) {
                        int i2 = ((parseInt * 60) + parseInt2) * 60 * 1000;
                        if (!"-".equals(substring)) {
                            i = -1;
                        }
                        time += i2 * i;
                    }
                }
                if (str2 != null) {
                    time += ExifInterfaceUtils.parseSubSeconds(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = NON_ZERO_TIME_PATTERN;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date parse = sFormatterPrimary.parse(str, parsePosition);
                    if (parse == null && (parse = sFormatterSecondary.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(parse.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    private void initForFilename(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.mSeekableFileDescriptor = fileInputStream2.getFD();
                } else {
                    this.mSeekableFileDescriptor = null;
                }
                loadAttributes(fileInputStream2);
                ExifInterfaceUtils.closeQuietly(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                ExifInterfaceUtils.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            String[] split3 = split[1].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            String[] split4 = split[2].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(LATITUDE_SOUTH) && !str2.equals(LONGITUDE_WEST)) {
                if (!str2.equals("N") && !str2.equals(LONGITUDE_EAST)) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private String convertDecimalDegree(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        if (isHeifFormat(bArr)) {
            return 12;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        if (isRw2Format(bArr)) {
            return 10;
        }
        if (isPngFormat(bArr)) {
            return 13;
        }
        return isWebpFormat(bArr) ? 14 : 0;
    }

    private static boolean isJpegFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isRafFormat(byte[] bArr) throws IOException {
        byte[] bytes = RAF_SIGNATURE.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isHeifFormat(byte[] bArr) throws IOException {
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        long readInt;
        byte[] bArr2;
        long j;
        ByteOrderedDataInputStream byteOrderedDataInputStream2 = null;
        try {
            try {
                byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = byteOrderedDataInputStream.readInt();
            bArr2 = new byte[4];
            byteOrderedDataInputStream.read(bArr2);
        } catch (Exception e2) {
            e = e2;
            byteOrderedDataInputStream2 = byteOrderedDataInputStream;
            if (DEBUG) {
                Log.d(TAG, "Exception parsing HEIF file type box.", e);
            }
            if (byteOrderedDataInputStream2 != null) {
                byteOrderedDataInputStream2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            byteOrderedDataInputStream2 = byteOrderedDataInputStream;
            if (byteOrderedDataInputStream2 != null) {
                byteOrderedDataInputStream2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, HEIF_TYPE_FTYP)) {
            byteOrderedDataInputStream.close();
            return false;
        }
        if (readInt == 1) {
            readInt = byteOrderedDataInputStream.readLong();
            j = 16;
            if (readInt < 16) {
                byteOrderedDataInputStream.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            byteOrderedDataInputStream.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (byteOrderedDataInputStream.read(bArr3) != 4) {
                byteOrderedDataInputStream.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, HEIF_BRAND_MIF1)) {
                    z = true;
                } else if (Arrays.equals(bArr3, HEIF_BRAND_HEIC)) {
                    z2 = true;
                }
                if (z && z2) {
                    byteOrderedDataInputStream.close();
                    return true;
                }
            }
        }
        byteOrderedDataInputStream.close();
        return false;
    }

    private boolean isOrfFormat(byte[] bArr) throws IOException {
        boolean z = false;
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream2);
                this.mExifByteOrder = readByteOrder;
                byteOrderedDataInputStream2.setByteOrder(readByteOrder);
                short readShort = byteOrderedDataInputStream2.readShort();
                z = (readShort == 20306 || readShort == 21330) ? true : true;
                byteOrderedDataInputStream2.close();
                return z;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean isRw2Format(byte[] bArr) throws IOException {
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream2);
                this.mExifByteOrder = readByteOrder;
                byteOrderedDataInputStream2.setByteOrder(readByteOrder);
                boolean z = byteOrderedDataInputStream2.readShort() == 85;
                byteOrderedDataInputStream2.close();
                return z;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean isPngFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = PNG_SIGNATURE;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isWebpFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = WEBP_SIGNATURE_1;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = WEBP_SIGNATURE_2;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[WEBP_SIGNATURE_1.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    private static boolean isExifDataOnly(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = IDENTIFIER_EXIF_APP1;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
        r22.setByteOrder(r21.mExifByteOrder);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0196, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[LOOP:0: B:10:0x0035->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getJpegAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream, int i, int i2) throws IOException {
        byte readByte;
        byte readByte2;
        String str;
        boolean z = DEBUG;
        String str2 = TAG;
        if (z) {
            Log.d(TAG, "getJpegAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte b = -1;
        if (byteOrderedDataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        } else if (byteOrderedDataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        } else {
            int i3 = 2;
            int i4 = 2;
            while (true) {
                if (byteOrderedDataInputStream.readByte() != b) {
                    throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                }
                int i5 = i4 + 1;
                byte readByte3 = byteOrderedDataInputStream.readByte();
                boolean z2 = DEBUG;
                if (z2) {
                    Log.d(str2, "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                }
                int i6 = i5 + 1;
                if (readByte3 != -39 && readByte3 != -38) {
                    int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort() - i3;
                    int i7 = i6 + i3;
                    if (z2) {
                        Log.d(str2, "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + (readUnsignedShort + 2) + ")");
                    }
                    if (readUnsignedShort < 0) {
                        throw new IOException("Invalid length");
                    }
                    if (readByte3 == -31) {
                        byte[] bArr = new byte[readUnsignedShort];
                        byteOrderedDataInputStream.readFully(bArr);
                        int i8 = i7 + readUnsignedShort;
                        byte[] bArr2 = IDENTIFIER_EXIF_APP1;
                        if (ExifInterfaceUtils.startsWith(bArr, bArr2)) {
                            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, readUnsignedShort);
                            this.mOffsetToExifData = i + i7 + bArr2.length;
                            readExifSegment(copyOfRange, i2);
                            setThumbnailData(new ByteOrderedDataInputStream(copyOfRange));
                        } else {
                            byte[] bArr3 = IDENTIFIER_XMP_APP1;
                            if (ExifInterfaceUtils.startsWith(bArr, bArr3)) {
                                int length = i7 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, readUnsignedShort);
                                if (getAttribute(TAG_XMP) == null) {
                                    str = str2;
                                    this.mAttributes[0].put(TAG_XMP, new ExifAttribute(1, copyOfRange2.length, length, copyOfRange2));
                                    this.mXmpIsFromSeparateMarker = true;
                                    i7 = i8;
                                }
                            }
                        }
                        str = str2;
                        i7 = i8;
                    } else if (readByte3 == -2) {
                        byte[] bArr4 = new byte[readUnsignedShort];
                        if (byteOrderedDataInputStream.read(bArr4) != readUnsignedShort) {
                            throw new IOException("Invalid exif");
                        }
                        if (getAttribute(TAG_USER_COMMENT) == null) {
                            this.mAttributes[1].put(TAG_USER_COMMENT, ExifAttribute.createString(new String(bArr4, ASCII)));
                        }
                        str = str2;
                    } else {
                        switch (readByte3) {
                            default:
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                }
                                            case -55:
                                            case -54:
                                            case -53:
                                                byteOrderedDataInputStream.skipFully(1);
                                                this.mAttributes[i2].put(i2 != 4 ? TAG_IMAGE_LENGTH : TAG_THUMBNAIL_IMAGE_LENGTH, ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                                this.mAttributes[i2].put(i2 != 4 ? TAG_IMAGE_WIDTH : TAG_THUMBNAIL_IMAGE_WIDTH, ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                                readUnsignedShort -= 5;
                                                break;
                                        }
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                        }
                        str = str2;
                        if (readUnsignedShort >= 0) {
                            throw new IOException("Invalid length");
                        }
                        byteOrderedDataInputStream.skipFully(readUnsignedShort);
                        i4 = i7 + readUnsignedShort;
                        str2 = str;
                        i3 = 2;
                        b = -1;
                    }
                    readUnsignedShort = 0;
                    if (readUnsignedShort >= 0) {
                    }
                }
            }
        }
    }

    private void getRawAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ExifAttribute exifAttribute;
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 5);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 4);
        validateImages();
        if (this.mMimeType != 8 || (exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
        seekableByteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
        seekableByteOrderedDataInputStream2.skipFully(6);
        readImageFileDirectory(seekableByteOrderedDataInputStream2, 9);
        ExifAttribute exifAttribute2 = this.mAttributes[9].get(TAG_COLOR_SPACE);
        if (exifAttribute2 != null) {
            this.mAttributes[1].put(TAG_COLOR_SPACE, exifAttribute2);
        }
    }

    private void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        boolean z = DEBUG;
        if (z) {
            Log.d(TAG, "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.skipFully(RAF_OFFSET_TO_JPEG_IMAGE_OFFSET);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.read(bArr2);
        byteOrderedDataInputStream.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.skipFully(i - byteOrderedDataInputStream.position());
        byteOrderedDataInputStream.read(bArr4);
        getJpegAttributes(new ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.skipFully(i3 - byteOrderedDataInputStream.position());
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        int readInt = byteOrderedDataInputStream.readInt();
        if (z) {
            Log.d(TAG, "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == TAG_RAF_IMAGE_SIZE.number) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute createUShort = ExifAttribute.createUShort(readShort, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(readShort2, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, createUShort);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, createUShort2);
                if (DEBUG) {
                    Log.d(TAG, "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.skipFully(readUnsignedShort2);
        }
    }

    private void getHeifAttributes(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    ExifInterfaceUtils.Api23Impl.setDataSource(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                        long mPosition;

                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
                        }

                        @Override // android.media.MediaDataSource
                        public long getSize() throws IOException {
                            return -1L;
                        }

                        @Override // android.media.MediaDataSource
                        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (j < 0) {
                                return -1;
                            }
                            try {
                                long j2 = this.mPosition;
                                if (j2 != j) {
                                    if (j2 >= 0 && j >= j2 + seekableByteOrderedDataInputStream.available()) {
                                        return -1;
                                    }
                                    seekableByteOrderedDataInputStream.seek(j);
                                    this.mPosition = j;
                                }
                                if (i2 > seekableByteOrderedDataInputStream.available()) {
                                    i2 = seekableByteOrderedDataInputStream.available();
                                }
                                int read = seekableByteOrderedDataInputStream.read(bArr, i, i2);
                                if (read >= 0) {
                                    this.mPosition += read;
                                    return read;
                                }
                            } catch (IOException unused) {
                            }
                            this.mPosition = -1L;
                            return -1;
                        }
                    });
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createUShort(Integer.parseInt(str), this.mExifByteOrder));
                    }
                    if (str2 != null) {
                        this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createUShort(Integer.parseInt(str2), this.mExifByteOrder));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createUShort(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.mExifByteOrder));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 <= 6) {
                            throw new IOException("Invalid exif length");
                        }
                        seekableByteOrderedDataInputStream.seek(parseInt2);
                        byte[] bArr = new byte[6];
                        if (seekableByteOrderedDataInputStream.read(bArr) != 6) {
                            throw new IOException("Can't read identifier");
                        }
                        int i = parseInt2 + 6;
                        int i2 = parseInt3 - 6;
                        if (!Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                            throw new IOException("Invalid identifier");
                        }
                        byte[] bArr2 = new byte[i2];
                        if (seekableByteOrderedDataInputStream.read(bArr2) != i2) {
                            throw new IOException("Can't read exif");
                        }
                        this.mOffsetToExifData = i;
                        readExifSegment(bArr2, 0);
                    }
                    if (DEBUG) {
                        Log.d(TAG, "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    private void getStandaloneAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        seekableByteOrderedDataInputStream.skipFully(bArr.length);
        byte[] bArr2 = new byte[seekableByteOrderedDataInputStream.available()];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        this.mOffsetToExifData = bArr.length;
        readExifSegment(bArr2, 0);
    }

    private void getOrfAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        int i;
        int i2;
        getRawAttributes(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE);
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
            seekableByteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.seek(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.seek(12L);
            }
            readImageFileDirectory(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            ExifAttribute exifAttribute3 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT, exifAttribute2);
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, exifAttribute3);
            }
            ExifAttribute exifAttribute4 = this.mAttributes[8].get(TAG_ORF_ASPECT_FRAME);
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 4) {
                    Log.w(TAG, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ExifAttribute createUShort = ExifAttribute.createUShort(i5, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(i6, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, createUShort);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, createUShort2);
            }
        }
    }

    private void getRw2Attributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        if (DEBUG) {
            Log.d(TAG, "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        getRawAttributes(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.mAttributes[0].get(TAG_RW2_JPG_FROM_RAW);
        if (exifAttribute != null) {
            getJpegAttributes(new ByteOrderedDataInputStream(exifAttribute.bytes), (int) exifAttribute.bytesOffset, 5);
        }
        ExifAttribute exifAttribute2 = this.mAttributes[0].get(TAG_RW2_ISO);
        ExifAttribute exifAttribute3 = this.mAttributes[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.mAttributes[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, exifAttribute2);
    }

    private void getPngAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        if (DEBUG) {
            Log.d(TAG, "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte[] bArr = PNG_SIGNATURE;
        byteOrderedDataInputStream.skipFully(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = i + 4;
                if (i2 == 16 && !Arrays.equals(bArr2, PNG_CHUNK_TYPE_IHDR)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, PNG_CHUNK_TYPE_IEND)) {
                    return;
                }
                if (Arrays.equals(bArr2, PNG_CHUNK_TYPE_EXIF)) {
                    byte[] bArr3 = new byte[readInt];
                    if (byteOrderedDataInputStream.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.byteArrayToHexString(bArr2));
                    }
                    int readInt2 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) != readInt2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    this.mOffsetToExifData = i2;
                    readExifSegment(bArr3, 0);
                    validateImages();
                    setThumbnailData(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                int i3 = readInt + 4;
                byteOrderedDataInputStream.skipFully(i3);
                length = i2 + i3;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void getWebpAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        if (DEBUG) {
            Log.d(TAG, "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        byteOrderedDataInputStream.skipFully(WEBP_SIGNATURE_1.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i = length + 4 + 4;
                if (Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (byteOrderedDataInputStream.read(bArr3) != readInt2) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.byteArrayToHexString(bArr2));
                    }
                    this.mOffsetToExifData = i;
                    readExifSegment(bArr3, 0);
                    setThumbnailData(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.skipFully(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void saveJpegAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (DEBUG) {
            Log.d(TAG, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, ByteOrder.BIG_ENDIAN);
        if (byteOrderedDataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        byteOrderedDataOutputStream.writeByte(-1);
        if (byteOrderedDataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        byteOrderedDataOutputStream.writeByte(-40);
        ExifAttribute remove = (getAttribute(TAG_XMP) == null || !this.mXmpIsFromSeparateMarker) ? null : this.mAttributes[0].remove(TAG_XMP);
        byteOrderedDataOutputStream.writeByte(-1);
        byteOrderedDataOutputStream.writeByte(-31);
        writeExifSegment(byteOrderedDataOutputStream);
        if (remove != null) {
            this.mAttributes[0].put(TAG_XMP, remove);
        }
        byte[] bArr = new byte[4096];
        while (byteOrderedDataInputStream.readByte() == -1) {
            byte readByte = byteOrderedDataInputStream.readByte();
            if (readByte == -39 || readByte == -38) {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
                return;
            } else if (readByte == -31) {
                int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort() - 2;
                if (readUnsignedShort < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort >= 6) {
                    if (byteOrderedDataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, IDENTIFIER_EXIF_APP1)) {
                        byteOrderedDataInputStream.skipFully(readUnsignedShort - 6);
                    }
                }
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort + 2);
                if (readUnsignedShort >= 6) {
                    readUnsignedShort -= 6;
                    byteOrderedDataOutputStream.write(bArr2);
                }
                while (readUnsignedShort > 0) {
                    int read = byteOrderedDataInputStream.read(bArr, 0, Math.min(readUnsignedShort, 4096));
                    if (read >= 0) {
                        byteOrderedDataOutputStream.write(bArr, 0, read);
                        readUnsignedShort -= read;
                    }
                }
            } else {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
                byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort2);
                int i = readUnsignedShort2 - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int read2 = byteOrderedDataInputStream.read(bArr, 0, Math.min(i, 4096));
                    if (read2 >= 0) {
                        byteOrderedDataOutputStream.write(bArr, 0, read2);
                        i -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void savePngAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (DEBUG) {
            Log.d(TAG, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, ByteOrder.BIG_ENDIAN);
        byte[] bArr = PNG_SIGNATURE;
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr.length);
        int i = this.mOffsetToExifData;
        if (i == 0) {
            int readInt = byteOrderedDataInputStream.readInt();
            byteOrderedDataOutputStream.writeInt(readInt);
            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt + 4 + 4);
        } else {
            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, ((i - bArr.length) - 4) - 4);
            byteOrderedDataInputStream.skipFully(byteOrderedDataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ByteOrderedDataOutputStream byteOrderedDataOutputStream2 = new ByteOrderedDataOutputStream(byteArrayOutputStream2, ByteOrder.BIG_ENDIAN);
                writeExifSegment(byteOrderedDataOutputStream2);
                byte[] byteArray = ((ByteArrayOutputStream) byteOrderedDataOutputStream2.mOutputStream).toByteArray();
                byteOrderedDataOutputStream.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                byteOrderedDataOutputStream.writeInt((int) crc32.getValue());
                ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                ExifInterfaceUtils.closeQuietly(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void saveWebpAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        if (DEBUG) {
            Log.d(TAG, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream, ByteOrder.LITTLE_ENDIAN);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        byte[] bArr = WEBP_SIGNATURE_1;
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr.length);
        byte[] bArr2 = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrderedDataOutputStream byteOrderedDataOutputStream2 = new ByteOrderedDataOutputStream(byteArrayOutputStream, ByteOrder.LITTLE_ENDIAN);
            int i4 = this.mOffsetToExifData;
            if (i4 != 0) {
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, ((i4 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                byteOrderedDataInputStream.skipFully(4);
                int readInt = byteOrderedDataInputStream.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                byteOrderedDataInputStream.skipFully(readInt);
                writeExifSegment(byteOrderedDataOutputStream2);
            } else {
                byte[] bArr3 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = WEBP_CHUNK_TYPE_VP8X;
                boolean z = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt2 = byteOrderedDataInputStream.readInt();
                    byte[] bArr5 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                    byteOrderedDataInputStream.read(bArr5);
                    byte b = (byte) (8 | bArr5[0]);
                    bArr5[0] = b;
                    boolean z2 = ((b >> 1) & 1) == 1;
                    byteOrderedDataOutputStream2.write(bArr4);
                    byteOrderedDataOutputStream2.writeInt(readInt2);
                    byteOrderedDataOutputStream2.write(bArr5);
                    if (z2) {
                        copyChunksUpToGivenChunkType(byteOrderedDataInputStream, byteOrderedDataOutputStream2, WEBP_CHUNK_TYPE_ANIM, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, WEBP_CHUNK_TYPE_ANMF)) {
                                break;
                            }
                            copyWebPChunk(byteOrderedDataInputStream, byteOrderedDataOutputStream2, bArr6);
                        }
                        writeExifSegment(byteOrderedDataOutputStream2);
                    } else {
                        copyChunksUpToGivenChunkType(byteOrderedDataInputStream, byteOrderedDataOutputStream2, WEBP_CHUNK_TYPE_VP8, WEBP_CHUNK_TYPE_VP8L);
                        writeExifSegment(byteOrderedDataOutputStream2);
                    }
                } else {
                    byte[] bArr7 = WEBP_CHUNK_TYPE_VP8;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                        int readInt3 = byteOrderedDataInputStream.readInt();
                        int i5 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            byteOrderedDataInputStream.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (byteOrderedDataInputStream.read(bArr9) != 3 || !Arrays.equals(WEBP_VP8_SIGNATURE, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i = byteOrderedDataInputStream.readInt();
                            i5 -= 10;
                            i3 = (i << 2) >> 18;
                            i2 = (i << 18) >> 18;
                            z = false;
                        } else if (!Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                            i = 0;
                            z = false;
                            i2 = 0;
                            i3 = 0;
                        } else if (byteOrderedDataInputStream.readByte() != 47) {
                            throw new IOException("Encountered error while checking VP8L signature");
                        } else {
                            i = byteOrderedDataInputStream.readInt();
                            i2 = (i & 16383) + 1;
                            i3 = ((i & 268419072) >>> 14) + 1;
                            if ((i & 268435456) == 0) {
                                z = false;
                            }
                            i5 -= 5;
                        }
                        byteOrderedDataOutputStream2.write(bArr4);
                        byteOrderedDataOutputStream2.writeInt(10);
                        byte[] bArr10 = new byte[10];
                        if (z) {
                            bArr10[0] = (byte) (bArr10[0] | Ascii.DLE);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i6 = i2 - 1;
                        int i7 = i3 - 1;
                        bArr10[4] = (byte) i6;
                        bArr10[5] = (byte) (i6 >> 8);
                        bArr10[6] = (byte) (i6 >> 16);
                        bArr10[7] = (byte) i7;
                        bArr10[8] = (byte) (i7 >> 8);
                        bArr10[9] = (byte) (i7 >> 16);
                        byteOrderedDataOutputStream2.write(bArr10);
                        byteOrderedDataOutputStream2.write(bArr3);
                        byteOrderedDataOutputStream2.writeInt(readInt3);
                        if (Arrays.equals(bArr3, bArr7)) {
                            byteOrderedDataOutputStream2.write(bArr8);
                            byteOrderedDataOutputStream2.write(WEBP_VP8_SIGNATURE);
                            byteOrderedDataOutputStream2.writeInt(i);
                        } else if (Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                            byteOrderedDataOutputStream2.write(47);
                            byteOrderedDataOutputStream2.writeInt(i);
                        }
                        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, i5);
                        writeExifSegment(byteOrderedDataOutputStream2);
                    }
                }
            }
            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = WEBP_SIGNATURE_2;
            byteOrderedDataOutputStream.writeInt(size + bArr11.length);
            byteOrderedDataOutputStream.write(bArr11);
            byteArrayOutputStream.writeTo(byteOrderedDataOutputStream);
            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
            throw th;
        }
    }

    private void copyChunksUpToGivenChunkType(ByteOrderedDataInputStream byteOrderedDataInputStream, ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (byteOrderedDataInputStream.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = ASCII;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            copyWebPChunk(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void copyWebPChunk(ByteOrderedDataInputStream byteOrderedDataInputStream, ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr) throws IOException {
        int readInt = byteOrderedDataInputStream.readInt();
        byteOrderedDataOutputStream.write(bArr);
        byteOrderedDataOutputStream.writeInt(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt);
    }

    private void readExifSegment(byte[] bArr, int i) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, i);
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.mAttributes[0].put(TAG_DATETIME, ExifAttribute.createString(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.mAttributes[1].put(TAG_LIGHT_SOURCE, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
    }

    private ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            if (DEBUG) {
                Log.d(TAG, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (DEBUG) {
                Log.d(TAG, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void parseTiffHeaders(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i = this.mMimeType;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = byteOrderedDataInputStream.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            byteOrderedDataInputStream.skipFully(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readImageFileDirectory(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws IOException {
        String str;
        short s;
        int[] iArr;
        long j;
        boolean z;
        short s2;
        long j2;
        String str2;
        int i2;
        String str3;
        int readUnsignedShort;
        long j3;
        this.mAttributesOffsets.add(Integer.valueOf(seekableByteOrderedDataInputStream.mPosition));
        short readShort = seekableByteOrderedDataInputStream.readShort();
        boolean z2 = DEBUG;
        String str4 = TAG;
        if (z2) {
            Log.d(TAG, "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        char c = 0;
        short s3 = 0;
        while (s3 < readShort) {
            int readUnsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int readInt = seekableByteOrderedDataInputStream.readInt();
            long position = seekableByteOrderedDataInputStream.position() + 4;
            ExifTag exifTag = sExifTagMapsForReading[i].get(Integer.valueOf(readUnsignedShort2));
            boolean z3 = DEBUG;
            if (z3) {
                Object[] objArr = new Object[5];
                objArr[c] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(readUnsignedShort2);
                objArr[2] = exifTag != null ? exifTag.name : null;
                objArr[3] = Integer.valueOf(readUnsignedShort3);
                objArr[4] = Integer.valueOf(readInt);
                Log.d(str4, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (exifTag != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < IFD_FORMAT_BYTES_PER_FORMAT.length) {
                        if (exifTag.isFormatCompatible(readUnsignedShort3)) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = exifTag.primaryFormat;
                            }
                            str = str4;
                            s = s3;
                            j = readInt * iArr[readUnsignedShort3];
                            if (j < 0 || j > 2147483647L) {
                                if (z3) {
                                    Log.d(str, "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z = false;
                                if (z) {
                                    seekableByteOrderedDataInputStream.seek(position);
                                    s2 = readShort;
                                    str3 = str;
                                } else {
                                    if (j > 4) {
                                        int readInt2 = seekableByteOrderedDataInputStream.readInt();
                                        s2 = readShort;
                                        if (z3) {
                                            j2 = position;
                                            Log.d(str, "seek to data offset: " + readInt2);
                                        } else {
                                            j2 = position;
                                        }
                                        if (this.mMimeType == 7) {
                                            if (TAG_MAKER_NOTE.equals(exifTag.name)) {
                                                this.mOrfMakerNoteOffset = readInt2;
                                            } else if (i == 6 && TAG_ORF_THUMBNAIL_IMAGE.equals(exifTag.name)) {
                                                this.mOrfThumbnailOffset = readInt2;
                                                this.mOrfThumbnailLength = readInt;
                                                ExifAttribute createUShort = ExifAttribute.createUShort(6, this.mExifByteOrder);
                                                i2 = readInt;
                                                ExifAttribute createULong = ExifAttribute.createULong(this.mOrfThumbnailOffset, this.mExifByteOrder);
                                                str2 = str;
                                                ExifAttribute createULong2 = ExifAttribute.createULong(this.mOrfThumbnailLength, this.mExifByteOrder);
                                                this.mAttributes[4].put(TAG_COMPRESSION, createUShort);
                                                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, createULong);
                                                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, createULong2);
                                                seekableByteOrderedDataInputStream.seek(readInt2);
                                            }
                                        }
                                        str2 = str;
                                        i2 = readInt;
                                        seekableByteOrderedDataInputStream.seek(readInt2);
                                    } else {
                                        s2 = readShort;
                                        j2 = position;
                                        str2 = str;
                                        i2 = readInt;
                                    }
                                    Integer num = sExifPointerTagMap.get(Integer.valueOf(readUnsignedShort2));
                                    if (z3) {
                                        str3 = str2;
                                        Log.d(str3, "nextIfdType: " + num + " byteCount: " + j);
                                    } else {
                                        str3 = str2;
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 == 3) {
                                            readUnsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                                        } else {
                                            if (readUnsignedShort3 == 4) {
                                                j3 = seekableByteOrderedDataInputStream.readUnsignedInt();
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readInt();
                                            } else {
                                                j3 = -1;
                                            }
                                            if (z3) {
                                                Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j3), exifTag.name));
                                            }
                                            if (j3 <= 0) {
                                                if (!this.mAttributesOffsets.contains(Integer.valueOf((int) j3))) {
                                                    seekableByteOrderedDataInputStream.seek(j3);
                                                    readImageFileDirectory(seekableByteOrderedDataInputStream, num.intValue());
                                                } else if (z3) {
                                                    Log.d(str3, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                                                }
                                            } else if (z3) {
                                                Log.d(str3, "Skip jump into the IFD since its offset is invalid: " + j3);
                                            }
                                            seekableByteOrderedDataInputStream.seek(j2);
                                        }
                                        j3 = readUnsignedShort;
                                        if (z3) {
                                        }
                                        if (j3 <= 0) {
                                        }
                                        seekableByteOrderedDataInputStream.seek(j2);
                                    } else {
                                        long j4 = j2;
                                        byte[] bArr = new byte[(int) j];
                                        seekableByteOrderedDataInputStream.readFully(bArr);
                                        ExifAttribute exifAttribute = new ExifAttribute(readUnsignedShort3, i2, seekableByteOrderedDataInputStream.position() + this.mOffsetToExifData, bArr);
                                        this.mAttributes[i].put(exifTag.name, exifAttribute);
                                        if (TAG_DNG_VERSION.equals(exifTag.name)) {
                                            this.mMimeType = 3;
                                        }
                                        if (((TAG_MAKE.equals(exifTag.name) || TAG_MODEL.equals(exifTag.name)) && exifAttribute.getStringValue(this.mExifByteOrder).contains(PEF_SIGNATURE)) || (TAG_COMPRESSION.equals(exifTag.name) && exifAttribute.getIntValue(this.mExifByteOrder) == 65535)) {
                                            this.mMimeType = 8;
                                        }
                                        if (seekableByteOrderedDataInputStream.position() != j4) {
                                            seekableByteOrderedDataInputStream.seek(j4);
                                        }
                                    }
                                }
                                s3 = (short) (s + 1);
                                str4 = str3;
                                readShort = s2;
                                c = 0;
                            } else {
                                z = true;
                                if (z) {
                                }
                                s3 = (short) (s + 1);
                                str4 = str3;
                                readShort = s2;
                                c = 0;
                            }
                        } else if (z3) {
                            Log.d(str4, "Skip the tag entry since data format (" + IFD_FORMAT_NAMES[readUnsignedShort3] + ") is unexpected for tag: " + exifTag.name);
                        }
                    }
                }
                str = str4;
                s = s3;
                if (z3) {
                    Log.d(str, "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j = 0;
                z = false;
                if (z) {
                }
                s3 = (short) (s + 1);
                str4 = str3;
                readShort = s2;
                c = 0;
            } else if (z3) {
                Log.d(str4, "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            str = str4;
            s = s3;
            j = 0;
            z = false;
            if (z) {
            }
            s3 = (short) (s + 1);
            str4 = str3;
            readShort = s2;
            c = 0;
        }
        String str5 = str4;
        int readInt3 = seekableByteOrderedDataInputStream.readInt();
        boolean z4 = DEBUG;
        if (z4) {
            Log.d(str5, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j5 = readInt3;
        if (j5 <= 0) {
            if (z4) {
                Log.d(str5, "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            }
        } else if (this.mAttributesOffsets.contains(Integer.valueOf(readInt3))) {
            if (z4) {
                Log.d(str5, "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
            }
        } else {
            seekableByteOrderedDataInputStream.seek(j5);
            if (this.mAttributes[4].isEmpty()) {
                readImageFileDirectory(seekableByteOrderedDataInputStream, 4);
            } else if (this.mAttributes[5].isEmpty()) {
                readImageFileDirectory(seekableByteOrderedDataInputStream, 5);
            }
        }
    }

    private void retrieveJpegImageSize(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws IOException {
        ExifAttribute exifAttribute = this.mAttributes[i].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = this.mAttributes[i].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            ExifAttribute exifAttribute3 = this.mAttributes[i].get(TAG_JPEG_INTERCHANGE_FORMAT);
            ExifAttribute exifAttribute4 = this.mAttributes[i].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int intValue = exifAttribute3.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute3.getIntValue(this.mExifByteOrder);
            seekableByteOrderedDataInputStream.seek(intValue);
            byte[] bArr = new byte[intValue2];
            seekableByteOrderedDataInputStream.read(bArr);
            getJpegAttributes(new ByteOrderedDataInputStream(bArr), intValue, i);
        }
    }

    private void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        HashMap<String, ExifAttribute> hashMap = this.mAttributes[4];
        ExifAttribute exifAttribute = hashMap.get(TAG_COMPRESSION);
        if (exifAttribute != null) {
            int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
            this.mThumbnailCompression = intValue;
            if (intValue != 1) {
                if (intValue == 6) {
                    handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
                    return;
                } else if (intValue != 7) {
                    return;
                }
            }
            if (isSupportedDataType(hashMap)) {
                handleThumbnailFromStrips(byteOrderedDataInputStream, hashMap);
                return;
            }
            return;
        }
        this.mThumbnailCompression = 6;
        handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
    }

    private void handleThumbnailFromJfif(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT);
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        if (this.mMimeType == 7) {
            intValue += this.mOrfMakerNoteOffset;
        }
        if (intValue > 0 && intValue2 > 0) {
            this.mHasThumbnail = true;
            if (this.mFilename == null && this.mAssetInputStream == null && this.mSeekableFileDescriptor == null) {
                byte[] bArr = new byte[intValue2];
                byteOrderedDataInputStream.skip(intValue);
                byteOrderedDataInputStream.read(bArr);
                this.mThumbnailBytes = bArr;
            }
            this.mThumbnailOffset = intValue;
            this.mThumbnailLength = intValue2;
        }
        if (DEBUG) {
            Log.d(TAG, "Setting thumbnail attributes with offset: " + intValue + ", length: " + intValue2);
        }
    }

    private void handleThumbnailFromStrips(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get(TAG_STRIP_OFFSETS);
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] convertToLongArray = ExifInterfaceUtils.convertToLongArray(exifAttribute.getValue(this.mExifByteOrder));
        long[] convertToLongArray2 = ExifInterfaceUtils.convertToLongArray(exifAttribute2.getValue(this.mExifByteOrder));
        if (convertToLongArray == null || convertToLongArray.length == 0) {
            Log.w(TAG, "stripOffsets should not be null or have zero length.");
        } else if (convertToLongArray2 == null || convertToLongArray2.length == 0) {
            Log.w(TAG, "stripByteCounts should not be null or have zero length.");
        } else if (convertToLongArray.length != convertToLongArray2.length) {
            Log.w(TAG, "stripOffsets and stripByteCounts should have same length.");
        } else {
            long j = 0;
            for (long j2 : convertToLongArray2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.mAreThumbnailStripsConsecutive = true;
            this.mHasThumbnailStrips = true;
            this.mHasThumbnail = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < convertToLongArray.length; i4++) {
                int i5 = (int) convertToLongArray[i4];
                int i6 = (int) convertToLongArray2[i4];
                if (i4 < convertToLongArray.length - 1 && i5 + i6 != convertToLongArray[i4 + 1]) {
                    this.mAreThumbnailStripsConsecutive = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    Log.d(TAG, "Invalid strip offset value");
                    return;
                }
                long j3 = i7;
                if (byteOrderedDataInputStream.skip(j3) != j3) {
                    Log.d(TAG, "Failed to skip " + i7 + " bytes.");
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (byteOrderedDataInputStream.read(bArr2) != i6) {
                    Log.d(TAG, "Failed to read " + i6 + " bytes.");
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.mThumbnailBytes = bArr;
            if (this.mAreThumbnailStripsConsecutive) {
                this.mThumbnailOffset = (int) convertToLongArray[0];
                this.mThumbnailLength = i;
            }
        }
    }

    private boolean isSupportedDataType(HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute;
        int intValue;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_BITS_PER_SAMPLE);
        if (exifAttribute2 != null) {
            int[] iArr = (int[]) exifAttribute2.getValue(this.mExifByteOrder);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.mMimeType == 3 && (exifAttribute = (ExifAttribute) hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) != null && (((intValue = exifAttribute.getIntValue(this.mExifByteOrder)) == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (DEBUG) {
            Log.d(TAG, "Unsupported data type value");
            return false;
        }
        return false;
    }

    private boolean isThumbnail(HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    private void validateImages() throws IOException {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_PIXEL_X_DIMENSION);
        ExifAttribute exifAttribute2 = this.mAttributes[1].get(TAG_PIXEL_Y_DIMENSION);
        if (exifAttribute != null && exifAttribute2 != null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttribute);
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttribute2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!isThumbnail(this.mAttributes[4])) {
            Log.d(TAG, "No image meets the size requirements of a thumbnail image.");
        }
        replaceInvalidTags(0, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(4, TAG_ORIENTATION, TAG_THUMBNAIL_ORIENTATION);
        replaceInvalidTags(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        replaceInvalidTags(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    private void updateImageSizeValues(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws IOException {
        ExifAttribute createUShort;
        ExifAttribute createUShort2;
        ExifAttribute exifAttribute = this.mAttributes[i].get(TAG_DEFAULT_CROP_SIZE);
        ExifAttribute exifAttribute2 = this.mAttributes[i].get(TAG_RW2_SENSOR_TOP_BORDER);
        ExifAttribute exifAttribute3 = this.mAttributes[i].get(TAG_RW2_SENSOR_LEFT_BORDER);
        ExifAttribute exifAttribute4 = this.mAttributes[i].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        ExifAttribute exifAttribute5 = this.mAttributes[i].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (exifAttribute == null) {
            if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
                int intValue = exifAttribute2.getIntValue(this.mExifByteOrder);
                int intValue2 = exifAttribute4.getIntValue(this.mExifByteOrder);
                int intValue3 = exifAttribute5.getIntValue(this.mExifByteOrder);
                int intValue4 = exifAttribute3.getIntValue(this.mExifByteOrder);
                if (intValue2 <= intValue || intValue3 <= intValue4) {
                    return;
                }
                ExifAttribute createUShort3 = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
                ExifAttribute createUShort4 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
                this.mAttributes[i].put(TAG_IMAGE_LENGTH, createUShort3);
                this.mAttributes[i].put(TAG_IMAGE_WIDTH, createUShort4);
                return;
            }
            retrieveJpegImageSize(seekableByteOrderedDataInputStream, i);
            return;
        }
        if (exifAttribute.format == 5) {
            Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
            if (rationalArr == null || rationalArr.length != 2) {
                Log.w(TAG, "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                return;
            }
            createUShort = ExifAttribute.createURational(rationalArr[0], this.mExifByteOrder);
            createUShort2 = ExifAttribute.createURational(rationalArr[1], this.mExifByteOrder);
        } else {
            int[] iArr = (int[]) exifAttribute.getValue(this.mExifByteOrder);
            if (iArr == null || iArr.length != 2) {
                Log.w(TAG, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            createUShort = ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
            createUShort2 = ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
        }
        this.mAttributes[i].put(TAG_IMAGE_WIDTH, createUShort);
        this.mAttributes[i].put(TAG_IMAGE_LENGTH, createUShort2);
    }

    private int writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (ExifTag exifTag : EXIF_POINTER_TAGS) {
            removeAttribute(exifTag.name);
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                removeAttribute(TAG_STRIP_OFFSETS);
                removeAttribute(TAG_STRIP_BYTE_COUNTS);
            } else {
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT);
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            for (Object obj : this.mAttributes[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.mAttributes[i].remove(entry.getKey());
                }
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, ExifAttribute.createUShort(0, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_STRIP_BYTE_COUNTS, ExifAttribute.createUShort(this.mThumbnailLength, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, ExifAttribute.createULong(0L, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifAttribute.createULong(this.mThumbnailLength, this.mExifByteOrder));
            }
        }
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, ExifAttribute> entry2 : this.mAttributes[i2].entrySet()) {
                int size = entry2.getValue().size();
                if (size > 4) {
                    i3 += size;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < EXIF_TAGS.length; i5++) {
            if (!this.mAttributes[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.mAttributes[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, ExifAttribute.createUShort(i4, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, ExifAttribute.createULong(i4, this.mExifByteOrder));
            }
            this.mThumbnailOffset = i4;
            i4 += this.mThumbnailLength;
        }
        if (this.mMimeType == 4) {
            i4 += 8;
        }
        if (DEBUG) {
            for (int i6 = 0; i6 < EXIF_TAGS.length; i6++) {
                Log.d(TAG, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.mAttributes[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)));
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr[1], this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(iArr[2], this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(iArr[3], this.mExifByteOrder));
        }
        int i7 = this.mMimeType;
        if (i7 == 4) {
            byteOrderedDataOutputStream.writeUnsignedShort(i4);
            byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        } else if (i7 == 13) {
            byteOrderedDataOutputStream.writeInt(i4);
            byteOrderedDataOutputStream.write(PNG_CHUNK_TYPE_EXIF);
        } else if (i7 == 14) {
            byteOrderedDataOutputStream.write(WEBP_CHUNK_TYPE_EXIF);
            byteOrderedDataOutputStream.writeInt(i4);
        }
        byteOrderedDataOutputStream.writeShort(this.mExifByteOrder == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifByteOrder);
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        for (int i8 = 0; i8 < EXIF_TAGS.length; i8++) {
            if (!this.mAttributes[i8].isEmpty()) {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mAttributes[i8].size());
                int size2 = iArr[i8] + 2 + (this.mAttributes[i8].size() * 12) + 4;
                for (Map.Entry<String, ExifAttribute> entry3 : this.mAttributes[i8].entrySet()) {
                    int i9 = sExifTagMapsForWriting[i8].get(entry3.getKey()).number;
                    ExifAttribute value = entry3.getValue();
                    int size3 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i9);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size3 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size2);
                        size2 += size3;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size3 < 4) {
                            while (size3 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size3++;
                            }
                        }
                    }
                }
                if (i8 == 0 && !this.mAttributes[4].isEmpty()) {
                    byteOrderedDataOutputStream.writeUnsignedInt(iArr[4]);
                } else {
                    byteOrderedDataOutputStream.writeUnsignedInt(0L);
                }
                for (Map.Entry<String, ExifAttribute> entry4 : this.mAttributes[i8].entrySet()) {
                    ExifAttribute value2 = entry4.getValue();
                    if (value2.bytes.length > 4) {
                        byteOrderedDataOutputStream.write(value2.bytes, 0, value2.bytes.length);
                    }
                }
            }
        }
        if (this.mHasThumbnail) {
            byteOrderedDataOutputStream.write(getThumbnailBytes());
        }
        if (this.mMimeType == 14 && i4 % 2 == 1) {
            byteOrderedDataOutputStream.writeByte(0);
        }
        byteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        return i4;
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
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        SeekableByteOrderedDataInputStream(byte[] bArr) throws IOException {
            super(bArr);
            this.mDataInputStream.mark(Integer.MAX_VALUE);
        }

        SeekableByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.mDataInputStream.mark(Integer.MAX_VALUE);
        }

        public void seek(long j) throws IOException {
            if (this.mPosition > j) {
                this.mPosition = 0;
                this.mDataInputStream.reset();
            } else {
                j -= this.mPosition;
            }
            skipFully((int) j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        private ByteOrder mByteOrder;
        final DataInputStream mDataInputStream;
        int mPosition;
        private byte[] mSkipBuffer;
        private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

        ByteOrderedDataInputStream(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.mByteOrder = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            dataInputStream.mark(0);
            this.mPosition = 0;
            this.mByteOrder = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public int position() {
            return this.mPosition;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.mDataInputStream.available();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.mDataInputStream.read(bArr, i, i2);
            this.mPosition += read;
            return read;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(ExifInterface.TAG, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readChar();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.mPosition += i2;
            this.mDataInputStream.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.mPosition += bArr.length;
            this.mDataInputStream.readFully(bArr);
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.mPosition++;
            int read = this.mDataInputStream.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.mPosition += 2;
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.mPosition += 4;
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            int read3 = this.mDataInputStream.read();
            int read4 = this.mDataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void skipFully(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.mDataInputStream.skip(i3);
                if (skip <= 0) {
                    if (this.mSkipBuffer == null) {
                        this.mSkipBuffer = new byte[8192];
                    }
                    skip = this.mDataInputStream.read(this.mSkipBuffer, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.mPosition += i2;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.mPosition += 2;
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        public long readUnsignedInt() throws IOException {
            return readInt() & 4294967295L;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.mPosition += 8;
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            int read3 = this.mDataInputStream.read();
            int read4 = this.mDataInputStream.read();
            int read5 = this.mDataInputStream.read();
            int read6 = this.mDataInputStream.read();
            int read7 = this.mDataInputStream.read();
            int read8 = this.mDataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        private ByteOrder mByteOrder;
        final OutputStream mOutputStream;

        public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.mOutputStream = outputStream;
            this.mByteOrder = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.mOutputStream.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.mOutputStream.write(bArr, i, i2);
        }

        public void writeByte(int i) throws IOException {
            this.mOutputStream.write(i);
        }

        public void writeShort(short s) throws IOException {
            if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write((s >>> 0) & 255);
                this.mOutputStream.write((s >>> 8) & 255);
            } else if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((s >>> 8) & 255);
                this.mOutputStream.write((s >>> 0) & 255);
            }
        }

        public void writeInt(int i) throws IOException {
            if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write((i >>> 0) & 255);
                this.mOutputStream.write((i >>> 8) & 255);
                this.mOutputStream.write((i >>> 16) & 255);
                this.mOutputStream.write((i >>> 24) & 255);
            } else if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((i >>> 24) & 255);
                this.mOutputStream.write((i >>> 16) & 255);
                this.mOutputStream.write((i >>> 8) & 255);
                this.mOutputStream.write((i >>> 0) & 255);
            }
        }

        public void writeUnsignedShort(int i) throws IOException {
            writeShort((short) i);
        }

        public void writeUnsignedInt(long j) throws IOException {
            writeInt((int) j);
        }
    }

    private void swapBasedOnImageSize(int i, int i2) throws IOException {
        if (this.mAttributes[i].isEmpty() || this.mAttributes[i2].isEmpty()) {
            if (DEBUG) {
                Log.d(TAG, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = this.mAttributes[i].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = this.mAttributes[i].get(TAG_IMAGE_WIDTH);
        ExifAttribute exifAttribute3 = this.mAttributes[i2].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute4 = this.mAttributes[i2].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            if (DEBUG) {
                Log.d(TAG, "First image does not contain valid size information");
            }
        } else if (exifAttribute3 == null || exifAttribute4 == null) {
            if (DEBUG) {
                Log.d(TAG, "Second image does not contain valid size information");
            }
        } else {
            int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
            int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
            int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
            if (intValue >= intValue3 || intValue2 >= intValue4) {
                return;
            }
            HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
            HashMap<String, ExifAttribute> hashMap = hashMapArr[i];
            hashMapArr[i] = hashMapArr[i2];
            hashMapArr[i2] = hashMap;
        }
    }

    private void replaceInvalidTags(int i, String str, String str2) {
        if (this.mAttributes[i].isEmpty() || this.mAttributes[i].get(str) == null) {
            return;
        }
        HashMap<String, ExifAttribute> hashMap = this.mAttributes[i];
        hashMap.put(str2, hashMap.get(str));
        this.mAttributes[i].remove(str);
    }
}
