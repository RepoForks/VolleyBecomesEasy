/*
 *
 *  * MIT License
 *  *
 *  * Copyright (c) 2017 Attiq ur Rehman
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 *
 */

package com.systems.network_manager.requests;

public class PhotoMultipartRequest {

//    private static final String FILE_PART_NAME = "file";
//    private final File mImageFile;
//    protected Map<String, String> headers;
//    private DataResponse listener;
//    private int index;
//    private MultipartEntityBuilder mBuilder = MultipartEntityBuilder.create();
//
//    public PhotoMultipartRequest(final int index, String url, final ErrorResponse errorListener, DataResponse listener, File imageFile) {
//        super(Method.POST, url, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                errorListener.onErrorResponse(index, error);
//            }
//        });
//
//        this.listener = listener;
//        mImageFile = imageFile;
//        this.index = index;
//        buildMultipartEntity();
//        setRetryPolicy(new DefaultRetryPolicy(
//                CustomRequest.DEFAULT_TIMEOUT_MS,
//                CustomRequest.DEFAULT_MAX_RETRIES,
//                CustomRequest.DEFAULT_BACKOFF_MULT));
//    }
//
//    @Override
//    public Map<String, String> getHeaders() throws AuthFailureError {
//        Map<String, String> headers = super.getHeaders();
//
//        if (headers == null
//                || headers.equals(Collections.emptyMap())) {
//            headers = new HashMap<String, String>();
//        }
//
//        headers.put("Accept", "application/json");
//
//        return headers;
//    }
//
//    private void buildMultipartEntity() {
//        mBuilder.addBinaryBody(FILE_PART_NAME, mImageFile, ContentType.create("image/jpeg"), mImageFile.getName());
//        mBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
//        mBuilder.setLaxMode().setBoundary("xx").setCharset(Charset.forName("UTF-8"));
//    }
//
//    @Override
//    public String getBodyContentType() {
//        String contentTypeHeader = mBuilder.build().getContentType().getValue();
//        return contentTypeHeader;
//    }
//
//    @Override
//    public byte[] getBody() throws AuthFailureError {
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        try {
//            mBuilder.build().writeTo(bos);
//        } catch (IOException e) {
//            VolleyLog.e("IOException writing to ByteArrayOutputStream bos, building the multipart request.");
//        }
//
//        return bos.toByteArray();
//    }
//
//    @Override
//    protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
//        try {
//            String jsonString = new String(response.data,
//                    HttpHeaderParser.parseCharset(response.headers));
//            return Response.success(new JSONObject(jsonString),
//                    HttpHeaderParser.parseCacheHeaders(response));
//        } catch (UnsupportedEncodingException e) {
//            return Response.error(new ParseError(e));
//        } catch (JSONException je) {
//            return Response.error(new ParseError(je));
//        }
//    }
//
//    @Override
//    protected void deliverResponse(JSONObject response) {
//        // TODO Auto-generated method stub
//        if (listener == null) {
//            return;
//        }
//        listener.onResponse(index, response);
//    }
}