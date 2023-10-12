import random
import timeit
import matplotlib.pyplot as plt
from bubble_sort import bubble_sort
from merge_sort import merge_sort
from insertion_sort import insertion_sort

def generate_input_data(size, input_type):
    if input_type == "crescente":
        return list(range(size))
    elif input_type == "decrescente":
        return list(range(size, 0, -1))
    elif input_type == "aleatorio":
        return random.sample(range(size), size)

def measure_execution_time(algorithm, input_data, repetitions=3):
    total_time = 0
    for _ in range(repetitions):
        data = input_data.copy()
        execution_time = timeit.timeit(lambda: algorithm(data), number=1)
        total_time += execution_time
    return total_time / repetitions

sizes = [1000, 5000, 10000, 20000, 30000]

input_types = ["crescente", "decrescente", "aleatorio"]

execution_times = {"Bubble Sort": {input_type: [] for input_type in input_types},
                   "Merge Sort": {input_type: [] for input_type in input_types},
                   "Insertion Sort": {input_type: [] for input_type in input_types}}

for size in sizes:
    for input_type in input_types:
        input_data = generate_input_data(size, input_type)

        bubble_time = measure_execution_time(bubble_sort, input_data)
        execution_times["Bubble Sort"][input_type].append(bubble_time)

        merge_time = measure_execution_time(merge_sort, input_data)
        execution_times["Merge Sort"][input_type].append(merge_time)

        insertion_time = measure_execution_time(insertion_sort, input_data)
        execution_times["Insertion Sort"][input_type].append(insertion_time)

for input_type in input_types:
    for algorithm in execution_times.keys():
        plt.plot(sizes, execution_times[algorithm][input_type], label=algorithm)

    plt.xlabel('Tamanho do Vetor de Entrada')
    plt.ylabel('Tempo de Execução (segundos)')
    plt.title(f'Desempenho de Algoritmos de Ordenação em Diferentes Tipos de Entrada ({input_type})')
    plt.legend()
    plt.show()