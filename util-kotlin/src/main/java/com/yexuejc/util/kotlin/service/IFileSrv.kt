package com.yexuejc.util.kotlin.service

import com.yexuejc.util.kotlin.web.vo.UploadFileModel

/**
 *
 * @PackageName: com.yexuejc.util.kotlin.service
 * @Description:
 * @author: maxf
 * @date: 2018/1/11 16:38
 */
interface IFileSrv {
    /**
     * 保存
     */
    fun save(model: UploadFileModel): Int
}