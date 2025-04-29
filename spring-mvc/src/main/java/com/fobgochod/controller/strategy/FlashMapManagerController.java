package com.fobgochod.controller.strategy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * FlashMapManagerController.java
 *
 * @author fobgochod
 * @see org.springframework.web.servlet.support.SessionFlashMapManager
 */
@Controller
public class FlashMapManagerController {

    @RequestMapping(value = "/flashmap", method = RequestMethod.POST)
    public String submit(RedirectAttributes attr) {
        // 将参数值设置到Input_Flash_Map_Attribute中，然后放到model中
        ((FlashMap) ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).
                getRequest().getAttribute(DispatcherServlet.OUTPUT_FLASH_MAP_ATTRIBUTE)).put("author", "张三丰");
        // 放到flashmap中，同时也设置到model中
        attr.addFlashAttribute("orderCode", "TC001");
        // 将参数拼接到url中
        attr.addAttribute("local", "china");
        // 获取flashmap中的值
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest();
        FlashMap outputFlashMap = RequestContextUtils.getOutputFlashMap(request);
        System.out.println(outputFlashMap.get("author"));
        System.out.println(outputFlashMap.get("orderCode"));
        System.out.println(outputFlashMap.get("local"));
        Object attribute = request.getAttribute(DispatcherServlet.OUTPUT_FLASH_MAP_ATTRIBUTE);
        System.out.println(attribute);
        return "redirect:orders";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String showOrders(Model model) {
        System.out.println(model.getAttribute("author"));
        System.out.println(model.getAttribute("orderCode"));
        System.out.println(model.getAttribute("local"));
        return "success";
    }
}
