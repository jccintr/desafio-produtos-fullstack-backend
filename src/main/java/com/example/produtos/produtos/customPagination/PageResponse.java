package com.example.produtos.produtos.customPagination;

import java.util.List;

import org.springframework.data.domain.Page;

public record PageResponse<T>(
		List<T> content,
	    int pageNumber,
	    int pageSize,
	    long totalElements,
	    int totalPages,
	    boolean first,
	    boolean last
		)
{
	
	
    
    public PageResponse(Page<T> page) {
    	
       this(page.getContent(),
	    	page.getNumber(),
	    	page.getSize(),
	    	page.getTotalElements(),
	    	page.getTotalPages(),
	    	page.isFirst(),
	    	page.isLast() );
    	
    }

    
}
