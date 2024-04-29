package midterm.mirian_charaia_1.task3;

import java.util.HashMap;
import java.util.Map;

public class info_of_c {
    public static void main(String[] args) {
        // C++ Game Development Libraries
        Map<String, String> libraries = new HashMap<>();
        libraries.put("SFML", "A simple and user-friendly library for 2D game development. SFML provides modules for graphics, windowing, audio, and network functionality.");
        libraries.put("OpenGL", "A widely-used open standard for 3D graphics rendering.");
        libraries.put("SDL", "A cross-platform development library designed for multimedia tasks, including graphics, windowing, audio, and input.");
        libraries.put("Cocos2d-x", "An open-source game development framework that supports both 2D and 3D game development.");

        // Game Engines in C++
        Map<String, String> gameEngines = new HashMap<>();
        gameEngines.put("Unity", "Imagine Unity as the friendly neighbor who’s always ready to lend a hand. It generally speaks C# and is well known for being easy to be familiar with which eventually makes it a great choice for developers who want to create games that can be enjoyed on various devices.");
        gameEngines.put("Unreal Engine", "Unreal Engine is like the tech guru with a flair for visuals. Basically, it offers a visual scripting language which is called Blueprints in addition to C++ that also makes it a very popular choice for developers who want to create visually-appealing and eye-catching games.");
        gameEngines.put("CryEngine", "CryEngine is just like the artist in the group, who is known for its stunning visuals and attention to detail. It is generally a very excellent choice for developers who basically wants to focus on creating visually appealing games.");
        gameEngines.put("Lumberyard", "Lumberyard is like the all-in-one toolkit that basically offers a wide range of tools and features for game development. It is a very strong and good option for game developers who want to scale their projects because of its interaction with Amazon Web Services (AWS).");

        // Advantages and Disadvantages of C++
        Map<String, String> advantagesDisadvantages = new HashMap<>();
        advantagesDisadvantages.put("Powerful and Efficient", "C++ allows low-level manipulation of memory, providing high performance.");
        advantagesDisadvantages.put("Complexity", "C++ is considered complex and can be challenging for beginners.");
        advantagesDisadvantages.put("Object-Oriented Programming", "Supports OOP principles, aiding in code organization and reusability.");
        advantagesDisadvantages.put("Steeper Learning Curve", "Requires a comprehensive understanding of memory management, pointers, and syntax.");
        advantagesDisadvantages.put("Versatility", "Suitable for various applications, from systems programming to game development.");
        advantagesDisadvantages.put("Absence of Garbage Collection", "Developers need to manually manage memory, increasing the risk of memory leaks.");
        advantagesDisadvantages.put("Standard Template Library (STL)", "Rich set of libraries for data structures, algorithms, and utilities.");
        advantagesDisadvantages.put("Platform Dependency", "Code written in C++ may not be entirely portable across different platforms.");
        advantagesDisadvantages.put("High Performance", "Compiled language with efficient code execution, ideal for resource-intensive tasks.");
        advantagesDisadvantages.put("Absence of Reflection", "C++ does not provide built-in reflection capabilities, limiting runtime introspection.");

        // Print the information
        System.out.println("C++ Game Development Libraries");
        for (Map.Entry<String, String> entry : libraries.entrySet()) {
            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\n");
        }

        System.out.println("Game Engines in C++");
        for (Map.Entry<String, String> entry : gameEngines.entrySet()) {
            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\n");
        }

        System.out.println("Advantages and Disadvantages of C++");
        for (Map.Entry<String, String> entry : advantagesDisadvantages.entrySet()) {
            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\n");
        }
    }
}
