/*                                                                                                                                         
  Copyright 2000 - 2018 Kyriba Corp. All Rights Reserved.                                                                                                          
  The content of this file is copyrighted by Kyriba Corporation and can not be                                                               
  reproduced, distributed, altered or used in any form, in whole or in part.                                                                          
  Date        Author  Changes                                                                                                                                                      
  2018/09/20  P-GLC   Initial                                                                                                                                              
 */
package com.kyriba.poc;

import javax.annotation.Nonnull;
import org.springframework.stereotype.Service;

@Service
public class PocServiceImpl implements PocService{

    @Override
    @Nonnull
    public String capitalize(@Nonnull String s) throws ValidationException {
        if(s.length() == 0){
            throw new ValidationException("chaine vide interdite");
        }
        return s.toUpperCase();
    }
}
