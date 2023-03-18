# Breadth First Search:

graph = {
  '1' : ['2','5'],
  '2' : ['3', '4'],
  '5' : ['6'],
  '3' : [],
  '4' : ['6'],
  '6' : []
}

visited = []
queue = []

def breadthFirstSearch(visited, graph, node):
  visited.append(node)
  queue.append(node)

  while queue:
    m = queue.pop(0)
    print (m, end = " ")

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

print("Breadth-First Search: ")
breadthFirstSearch(visited, graph, '1')

# Program Output:-  

# Breadth-First Search: 
# 1 2 5 3 4 6 



# Depth First Search:			

graph = {
  '1' : ['2','5'],
  '2' : ['3', '4'],
  '5' : ['6'],
  '3' : [],
  '4' : ['6'],
  '6' : []
}

visited = set()

def depthFirstSearch(visited, graph, node):
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            depthFirstSearch(visited, graph, neighbour)

print("Depth-First Search")
depthFirstSearch(visited, graph, '1')

# Program Output:-  

# Depth-First Search
# 1
# 2
# 3
# 4
# 6
# 5
