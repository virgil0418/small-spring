package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Resource接口用于获取inputStream
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
